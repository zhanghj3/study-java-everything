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
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.criteria.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class JpaSpecificationEmployeeDAOTest {
    @Autowired
    private JpaSpecificationEmployeeDAO jpaSpecificationEmployeeDAO;


    /**
     * 1) 分页
     * 2) 排序
     * 3) 查询条件
     */
    @Test
    public void testQuery(){
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        Pageable pageable = new PageRequest(0,10,sort);
        /**
         * 使用匿名内部类
         * root:就是我们需要查询的类型（Employee）
         * query:添加查询条件
         * cb:构建Predicate
         */

        Specification<Employee> specification = new Specification<Employee>() {
            @Override
            public Predicate toPredicate(Root<Employee> root,
                                         CriteriaQuery<?> criteriaQuery,
                                         CriteriaBuilder cb) {
                // path:root->Employee->age
                Path path = root.get("id");
                return cb.gt(path,50);
            }
        };
        Page<Employee> page = jpaSpecificationEmployeeDAO.findAll(specification,pageable);
        System.out.println("查询的总页数："+page.getTotalPages());
        System.out.println("查询的总记录数："+page.getTotalElements());
        System.out.println("查询的当前第几页："+(page.getNumber()+1));
        System.out.println("查询的当前页面的集合："+page.getContent());
        System.out.println("查询的当前页面的记录数："+page.getNumberOfElements());
        System.out.println("查询的总页数："+page.getTotalPages());
    }

}
