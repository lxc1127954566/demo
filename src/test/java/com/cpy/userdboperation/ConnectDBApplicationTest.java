package com.cpy.userdboperation;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
public class ConnectDBApplicationTest {

    @Autowired(required = false)
    DataSource dataSource;
    @Test
    public void connectDBTest() throws SQLException {
        System.out.println("获取数据源的类："+dataSource.getClass());

        Connection connection = dataSource.getConnection();
        System.out.println("获取数据库连接："+connection);

        connection.close();
    }
}
