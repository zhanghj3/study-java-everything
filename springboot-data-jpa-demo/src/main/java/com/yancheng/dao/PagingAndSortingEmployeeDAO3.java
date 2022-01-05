package com.yancheng.dao;

import com.yancheng.entity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 使用分页
 */
public interface PagingAndSortingEmployeeDAO3 extends PagingAndSortingRepository<Employee,Integer> {
}
