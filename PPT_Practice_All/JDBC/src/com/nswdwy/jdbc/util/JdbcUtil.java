package com.nswdwy.jdbc.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author yycstart
 * @create 2020-08-25 9:02
 */
public class JdbcUtil {
    public static Connection getConnection() throws SQLException, ClassNotFoundException, IOException {
        InputStream resourceAsStream = JdbcUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        resourceAsStream.close();
        Class.forName(properties.getProperty("driverName"));
        Connection connection = DriverManager.getConnection(properties.getProperty("url"),
                                                            properties.getProperty("user"),
                                                            properties.getProperty("password"));
        return connection;
    }
    public static void close(Connection connection){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(Connection connection, Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

}
