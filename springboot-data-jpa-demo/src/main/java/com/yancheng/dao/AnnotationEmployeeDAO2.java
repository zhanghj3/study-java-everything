package com.yancheng.dao;

import com.yancheng.entity.Employee;
import org.springframework.data.repository.RepositoryDefinition;

/**
 * 注解方式
 */
@RepositoryDefinition(domainClass = Employee.class,idClass = Integer.class)
public interface AnnotationEmployeeDAO2 {
    Employee findEmployeeByName(String name);
}
