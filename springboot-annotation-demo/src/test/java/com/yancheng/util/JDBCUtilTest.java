package com.yancheng.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Connection;

/**
 * springboot的项目有专门的 spring-boot-starter-test 的jar包
 * 注解@SpringBootTest:获取启动类，加载配置，确定装载Spring程序的装载方法
 */
@SpringBootTest
// 让Junit运行Spring的测试环境，获得Spring环境的上下文支持
@RunWith(SpringRunner.class)
public class JDBCUtilTest {

    @Test
    public void testGetConnection() throws Exception {
        Connection connection = JDBCUtil.getConnection();
        Assert.assertNotNull(connection);
    }

}
