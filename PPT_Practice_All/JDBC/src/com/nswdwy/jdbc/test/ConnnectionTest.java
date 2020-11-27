package com.nswdwy.jdbc.test;

import com.nswdwy.jdbc.util.JdbcUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * @author yycstart
 * @create 2020-08-25 10:20
 */
public class ConnnectionTest {
    @Test
    public void test2() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JdbcUtil.getConnection();
            // 预编译, prepare p1 from 'sql';
            String sql = "create table if not exists customer (" +
                    "id int auto_increment," +
                    "name varchar(20)," +
                    "age int," +
                    "gender enum('男','女') default '男'," +
                    "email varchar(50)," +
                    "primary key(id)" +
                    ")";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(connection, preparedStatement);
        }
    }

    @Test
    public void test1() {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = JdbcUtil.getConnection();
            statement = connection.createStatement();
            // 可以执行DDL, 除了select外DML
            statement.executeUpdate("create table if not exists user (" +
                    "username varchar(20)," +
                    "password varchar(20)" +
                    ")");
            int row = statement.executeUpdate("insert into user(username, password) values('user', 'user')");
            System.out.println(row + " rows affected");
            row = statement.executeUpdate("insert into user(username, password) values('test', 'test')");
            System.out.println(row + " rows affected");
            row = statement.executeUpdate("insert into user(username, password) values('admin', 'admin')");
            System.out.println(row + " rows affected");
            row = statement.executeUpdate("insert into user(username, password) values('root', '123456')");
            System.out.println(row + " rows affected");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(connection, statement);
        }
    }
}
