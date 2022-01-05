package com.yancheng.dao;

import com.yancheng.entity.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * CrudRepository
 */
public interface CrudEmployeeDAO5 extends CrudRepository<Employee,Integer> {
}
