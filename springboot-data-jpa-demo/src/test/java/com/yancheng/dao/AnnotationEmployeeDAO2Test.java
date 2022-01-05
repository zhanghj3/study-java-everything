package com.yancheng.dao;

import com.yancheng.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AnnotationEmployeeDAO2Test {
    @Autowired
    private AnnotationEmployeeDAO2 annotationEmployeeDAO2;
    @Test
    public void testFindEmployeeByName(){
        Employee employee = annotationEmployeeDAO2.findEmployeeByName("zhang");
        System.out.println(employee);
    }
}
