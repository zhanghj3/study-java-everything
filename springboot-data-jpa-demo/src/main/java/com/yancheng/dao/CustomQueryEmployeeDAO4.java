package com.yancheng.dao;

import com.yancheng.entity.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 自定义SQL
 * 1) 写法跟普通的SQL不太一样，这里的表要用实体类代替
 * 2) 也可以支持原生的SQL，需要把nativeQuery设置为true
 */

@RepositoryDefinition(domainClass = Employee.class,idClass = Integer.class)
public interface CustomQueryEmployeeDAO4 {

    @Query("select o from Employee o")
    Employee queryById();

    @Query("select o from Employee o where o.age = ?1 and o.name = ?2")
    List<Employee> queryParams(int age, String name);

    @Query("select o from Employee o where o.age = :age and o.name = :name")
    List<Employee> queryParams2(@Param("age") int age, @Param("name") String name);

    @Query("select o from Employee o where o.name like %?1%")
    List<Employee> queryLike(String name);

    @Query("select o from Employee o where o.name like %:name%")
    List<Employee> queryLike2(@Param("name") String name);

    @Query(nativeQuery = true,value="select count(*) from employee")
    int queryCount();

    @Modifying
    @Query("update Employee o set o.age = :age where o.id = :id")
    void update(@Param("age") int age,@Param("id") int id);
}
