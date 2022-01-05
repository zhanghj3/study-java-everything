package com.yancheng.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 雇员：先开发实体类===>自动生成数据表
 * 1) @Entity是必须的
 * 2) @Id是必须的，表示主键
 * 3) @GeneratedValue表示逐渐ID是自增的，这样，自动生成表的时候，会自动添加一个sequence,
 *    就算自己手动设置ID，也会使用Hibernate自增的
 */
@Entity
public class Employee {
    @GeneratedValue
    @Id
    private Integer id;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
