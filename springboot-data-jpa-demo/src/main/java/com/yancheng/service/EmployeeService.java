package com.yancheng.service;

import com.yancheng.dao.CustomQueryEmployeeDAO4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 如果自定义的SQL，需要执行更新删除插入等操作，需要
 * 使用@Transactional+@Query+@Modifying这三个接口
 * 一般将操作封装在Service层
 */
@Service
public class EmployeeService {

    @Autowired
    CustomQueryEmployeeDAO4 employeeDAO4;

    @Transactional
    public void update(int age,int id){
        employeeDAO4.update(age,id);
    }
}
