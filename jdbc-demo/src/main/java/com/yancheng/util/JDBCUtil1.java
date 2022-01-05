package com.yancheng.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * JDBC工具类
 * 1) 获取工具类
 * 2) 释放资源
 */
public class JDBCUtil1 {
    public static Connection getConnection() throws Exception {
        // 不建议将这种配置写在java文件中，应该放到配置文件
        String url = "jdbc:mysql://192.168.30.128:3306/java_everything";
        String username = "zhanghj";
        String password = "123456";
        String driverClass = "com.mysql.cj.jdbc.Driver";
        Class.forName(driverClass);
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
}
