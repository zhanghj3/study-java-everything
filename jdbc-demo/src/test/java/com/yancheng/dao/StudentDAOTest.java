package com.yancheng.dao;

import com.yancheng.util.dao.StudentDAO;
import com.yancheng.util.dao.StudentDAOImpl;
import com.yancheng.util.entity.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class StudentDAOTest {
    @Test
    public void testQueryAllStudent() throws Exception{
        List<Student> list = new StudentDAOImpl().queryAllStudent();
        System.out.println(list);
        Assert.assertNotEquals(0,list.size());
    }
    @Test
    public void testSave() throws Exception{
       Student student = new Student(2,"liRan",20);
       new StudentDAOImpl().save(student);
    }
}
