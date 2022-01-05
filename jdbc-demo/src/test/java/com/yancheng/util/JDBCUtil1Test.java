package com.yancheng.util;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

public class JDBCUtil1Test {

    @Test
    public void tesetGetConnection() throws Exception{
        Connection connection = JDBCUtil1.getConnection();
        Assert.assertNotNull(connection);
    }
}
