package com.yancheng.dao;

import com.yancheng.entity.Employee;
import com.yancheng.service.EmployeeService5;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CrudEmployeeDAO5Test {
    @Autowired
    private EmployeeService5 employeeService5;
    @Test
    public void testFindEmployeeByName(){
        List<Employee> employees = new ArrayList<>();
        for(int i=0;i<100;i++){
            Employee employee = new Employee();
            employee.setId(10000+i);
            employee.setName("zhanghj-"+i);
            employee.setAge(18);
            employees.add(employee);
        }
        List<Employee> saved = employeeService5.saveAll(employees);
        System.out.println(saved);
    }
}
