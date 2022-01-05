package com.yancheng.util.dao;

import com.yancheng.util.entity.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> queryAllStudent() throws Exception;
    void save(Student student) throws Exception;
}
