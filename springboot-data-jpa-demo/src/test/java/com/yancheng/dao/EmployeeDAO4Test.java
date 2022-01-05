package com.yancheng.dao;

import com.yancheng.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeDAO4Test {
    @Autowired
    private CustomQueryEmployeeDAO4 employeeDAO4;
    @Test
    public void testFindEmployeeByName(){
        Employee employee = employeeDAO4.queryById();
        System.out.println(employee);
    }

    @Test
    public void testQueryParams(){
        List<Employee> list = employeeDAO4.queryParams(18,"zhang");
        System.out.println(list);
    }

    @Test
    public void testQueryParams2(){
        List<Employee> list = employeeDAO4.queryParams2(18,"zhang");
        System.out.println(list);
    }

    @Test
    public void testQueryLike(){
        List<Employee> list = employeeDAO4.queryLike("zh");
        System.out.println(list);
    }

    @Test
    public void testQueryLike2(){
        List<Employee> list = employeeDAO4.queryLike2("zh");
        System.out.println(list);
    }

    @Test
    public void testQueryCount(){
        int count= employeeDAO4.queryCount();
        System.out.println("总条数："+count);
    }

}
