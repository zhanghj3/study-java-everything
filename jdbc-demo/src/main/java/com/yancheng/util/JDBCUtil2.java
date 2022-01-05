package com.yancheng.util;


import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * JDBC工具类，使用配置文件
 * 1) 获取工具类
 * 2) 释放资源
 */
public class JDBCUtil2 {
    public static Connection getConnection() throws Exception {
        // 通过配置文件的方式读取
        InputStream inputStream = JDBCUtil2.class.getClassLoader().getResourceAsStream("db.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        String url = properties.getProperty("jdbc.url");
        String username = properties.getProperty("jdbc.username");
        String password = properties.getProperty("jdbc.password");
        String driverClass = properties.getProperty("jdbc.driverClass");
        Class.forName(driverClass);
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    /**
     * 释放DB相关的资源
     * @param connection
     * @param statement
     * @param resultSet
     */
    public static void release(Connection connection, Statement statement, ResultSet resultSet){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
