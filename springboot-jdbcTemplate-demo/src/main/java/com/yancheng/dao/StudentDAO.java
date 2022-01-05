package com.yancheng.dao;


import com.yancheng.entity.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> queryAllStudent() throws Exception;
    void save(Student student) throws Exception;
}
