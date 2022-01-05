package com.yancheng.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 成员变量使用@Value
 */
@Configuration
@PropertySource("classpath:db.properties")
public class JDBCUtil1 {

    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.driverClass}")
    private String driverClass;

    /**
     * 成员方法需要配合类上面的@Configuration等注解才能在启动的时候注入
     * @return
     * @throws Exception
     */
    @Bean("connection1")
    public Connection getConnection() throws Exception{
        Class.forName(driverClass);
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
}
