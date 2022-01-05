package com.yancheng.dao;

import com.yancheng.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 查询条件，排序，分页等
 */
public interface JpaSpecificationEmployeeDAO extends JpaSpecificationExecutor<Employee>, JpaRepository<Employee,Integer> {
}
