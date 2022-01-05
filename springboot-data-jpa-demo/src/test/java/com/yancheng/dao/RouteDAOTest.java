package com.yancheng.dao;

import com.yancheng.entity.Route;
import com.yancheng.enums.CountryEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.Optional;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RouteDAOTest {
    @Autowired
    private RouteDAO routeDAO;
    @Test
    public void testGetOne(){
        Optional<Route> route = routeDAO.findById(5);
        System.out.println(route);
    }

    @Test
    public void testSaveAndFlush(){
        // 因为id是自增的，所以插入的时候不需要填写id
        Route route = new Route("555555", CountryEnum.HK, LocalDateTime.now());
        System.out.println("插入的route:"+route);
        Route route1 = routeDAO.saveAndFlush(route);
        System.out.println("插入返回的route:"+route1);
    }
}
