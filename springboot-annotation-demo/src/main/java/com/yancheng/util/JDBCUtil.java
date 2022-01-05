package com.yancheng.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * 静态变量使用@Value
 *
 * 注解@Value使用的几个注意点
 * 1) 如果是给静态变量赋值，则只能在变量的set方法上面使用注解，需要配合@Component
 *    或者@Configuration等注解一起使用，而且自动生成的set方法是有static，
 *    有static就不会生效。
 * 2) 如果给私有变量赋值，则可以直接在变量上面颊@Value注解
 *
 * 注解@PropertySource可以指定@Value读取的配置文件，如果不指定，则默认是application.properties
 * 或者是application.yml
 */
@Configuration
@PropertySource("classpath:db.properties")
public class JDBCUtil {

    private static String url;

    private static String username;

    private static String password;

    private static String driverClass;
    @Value("${jdbc.url}")
    public void setUrl(String url) {
        JDBCUtil.url = url;
    }
    @Value("${jdbc.username}")
    public void setUsername(String username) {
        JDBCUtil.username = username;
    }
    @Value("${jdbc.password}")
    public void setPassword(String password) {
        JDBCUtil.password = password;
    }
    @Value("${jdbc.driverClass}")
    public void setDriverClass(String driverClass) {
        JDBCUtil.driverClass = driverClass;
    }

    /**
     * 静态方法的@Bean注解会在服务启动的时候注入
     * @return
     * @throws Exception
     */
    @Bean
    public static Connection getConnection() throws Exception{
        Class.forName(driverClass);
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
}
