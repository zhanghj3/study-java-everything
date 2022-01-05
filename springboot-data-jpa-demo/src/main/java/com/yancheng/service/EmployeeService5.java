package com.yancheng.service;

import com.yancheng.dao.CrudEmployeeDAO5;
import com.yancheng.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class EmployeeService5 {

    @Autowired
    CrudEmployeeDAO5 crudEmployeeDAO5;

    @Transactional
    public List<Employee> saveAll(List<Employee> employees){
        return (List) crudEmployeeDAO5.saveAll(employees);
    }
}
