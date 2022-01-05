package com.yancheng.util.dao;

import com.yancheng.util.JDBCUtil2;
import com.yancheng.util.entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO{
    /**
     * 查询所有的学生
     * 1.获取Connection连接
     * 2.创建Statement
     * 3.执行query
     * 4.得到ResultSet
     * 5.关闭连接
     */
    @Override
    public List<Student> queryAllStudent() throws Exception{
        List<Student> list = new ArrayList<>();
        String sql = "select * from student;";
        Connection connection = JDBCUtil2.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setAge(resultSet.getInt("age"));
            list.add(student);
        }
        JDBCUtil2.release(connection,statement,resultSet);
        return list;
    }

    @Override
    public void save(Student student) throws Exception{
        String sql = "insert into student(id,name,age) values(?,?,?);";
        Connection connection = JDBCUtil2.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,student.getId());
        statement.setString(2,student.getName());
        statement.setInt(3,student.getAge());
        statement.executeUpdate();
        JDBCUtil2.release(connection,statement,null);
    }
}
