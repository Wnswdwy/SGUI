package com.nswdwy.jdbc.test;


import com.nswdwy.jdbc.javabean.Customer;
import com.nswdwy.jdbc.util.JdbcUtil;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;

/**
 * @author yycstart
 * @create 2020-08-25 11:59
 */
public class SelectTest {
    @Test
    public void test1() {
        ArrayList<Customer> list = new ArrayList<>();
        String sql = "select id,name,gender,email from customer where id > ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1,0);
            resultSet = preparedStatement.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            System.out.println(columnCount);
            System.out.println("------------------------------------------------------");
            while(resultSet.next()){
                for (int i = 0; i < columnCount; i++) {
                    String columnLabel = metaData.getColumnLabel(i + 1);
                    Object object = resultSet.getObject(columnLabel);
                    System.out.print(object + "\t");
                }
                System.out.println();
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                String gender = resultSet.getString("gender");
//                String email = resultSet.getString("email");
//
//                System.out.println(id + "\t" + name + "\t" + gender + "\t" + email);
            }
            System.out.println("------------------------------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
    }
    @Test
    public void test() {
        ArrayList<Customer> list = new ArrayList<>();
        String sql = "select id,name,gender,email from customer where id > ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1,0);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
//                int id = resultSet.getInt(1);
//                String name = resultSet.getString(2);
//                String gender = resultSet.getString(3);
//                String email = resultSet.getString(4);
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                String email = resultSet.getString("email");
                Customer customer = new Customer(id, name, gender, email);
                list.add(customer);
//                System.out.println(id + "\t" + name + "\t" + gender + "\t" + email);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
