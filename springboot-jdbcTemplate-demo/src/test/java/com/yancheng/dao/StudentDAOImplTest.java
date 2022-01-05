package com.yancheng.dao;

import com.yancheng.entity.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
// 注解：@RunWith是让Junit运行Spring的测试环境，获得Spring环境的上下文支持，必须要加
@RunWith(SpringRunner.class)
public class StudentDAOImplTest {

    @Autowired
    private StudentDAOImpl studentDAO;
    @Test
    public void testQueryAllStudent() throws Exception{
        List<Student> list = studentDAO.queryAllStudent();
        System.out.println(list);
        Assert.assertNotEquals(0,list.size());
    }
    @Test
    public void testSave() throws Exception{
        studentDAO.save(new Student(111,"zhanghj",27));
    }
}
