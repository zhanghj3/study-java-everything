package com.yancheng.dao;

import com.yancheng.entity.Employee;
import org.springframework.data.repository.Repository;

/**
 * 继承接口方式
 */
public interface EmployeeDAO extends Repository<Employee,Integer> {
    Employee findEmployeeByName(String name);
}
