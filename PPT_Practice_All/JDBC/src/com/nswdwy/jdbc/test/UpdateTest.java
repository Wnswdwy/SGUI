package com.nswdwy.jdbc.test;

import com.nswdwy.jdbc.util.JdbcUtil;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author yycstart
 * @create 2020-08-24 16:52
 */
public class UpdateTest {
    @Test
    public void jdbcConnection3()  {
        Connection connection = null;
        try {
            connection = JdbcUtil.getConnection();
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            JdbcUtil.close(connection);
        }


    }
    @Test
    public void jdbcConnection() throws SQLException {
        Driver driver = new com.mysql.jdbc.Driver();
        String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","123456");
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
    }
    @Test
    public void jdbcConnection2()  {
        Connection connection = null;
        try {
            connection = JdbcUtil.getConnection();
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            JdbcUtil.close(connection);
        }


    }
}
