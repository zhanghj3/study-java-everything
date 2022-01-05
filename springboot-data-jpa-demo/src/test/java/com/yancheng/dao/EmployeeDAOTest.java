package com.yancheng.dao;

import com.yancheng.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeDAOTest {
    @Autowired
    private EmployeeDAO employeeDAO;
    @Test
    public void testFindEmployeeByName(){
        Employee employee = employeeDAO.findEmployeeByName("");
        System.out.println(employee);
    }
}
