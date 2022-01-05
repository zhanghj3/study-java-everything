package com.yancheng.dao;

import com.yancheng.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import javax.imageio.stream.IIOByteBuffer;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PagingAndSortingEmployeeDAO3Test {
    @Autowired
    private PagingAndSortingEmployeeDAO3 pagingAndSortingEmployeeDAO3;


    /**
     * 只分页
     */
    @Test
    public void testFindAll(){
        // page 的index是从0开始的
        Pageable pageable = new PageRequest(0,10);
        Page<Employee> page = pagingAndSortingEmployeeDAO3.findAll(pageable);
        System.out.println("查询的总页数："+page.getTotalPages());
        System.out.println("查询的总记录数："+page.getTotalElements());
        System.out.println("查询的当前第几页："+(page.getNumber()+1));
        System.out.println("查询的当前页面的集合："+page.getContent());
        System.out.println("查询的当前页面的记录数："+page.getNumberOfElements());
        System.out.println("查询的总页数："+page.getTotalPages());
    }

    /**
     * 分页加排序
     */
    @Test
    public void testFindAllBySort(){
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        Pageable pageable = new PageRequest(0,10,sort);
        Page<Employee> page = pagingAndSortingEmployeeDAO3.findAll(pageable);
        System.out.println("查询的总页数："+page.getTotalPages());
        System.out.println("查询的总记录数："+page.getTotalElements());
        System.out.println("查询的当前第几页："+(page.getNumber()+1));
        System.out.println("查询的当前页面的集合："+page.getContent());
        System.out.println("查询的当前页面的记录数："+page.getNumberOfElements());
        System.out.println("查询的总页数："+page.getTotalPages());
    }
}
