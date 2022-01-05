package com.yancheng.dao;

import com.yancheng.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class StudentDAOImpl implements StudentDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Student> queryAllStudent() throws Exception {
        String sql = "select * from student;";
        List<Student> list = new ArrayList<>();
        List<Map<String, Object>> dataList = jdbcTemplate.queryForList(sql);
        for(Map<String, Object> map : dataList){
            Student student = new Student();
            student.setId(Integer.parseInt(map.get("id").toString()));
            student.setName(map.get("name").toString());
            student.setAge(Integer.parseInt(map.get("age").toString()));
            list.add(student);
        }
        return list;
    }

    @Override
    public void save(Student student) throws Exception {
        String sql = "insert into student(id,name,age) values(?,?,?)";
        jdbcTemplate.update(sql,student.getId(),student.getName(),student.getAge());
    }
}
