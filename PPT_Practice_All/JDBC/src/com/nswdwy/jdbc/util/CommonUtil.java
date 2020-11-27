package com.nswdwy.jdbc.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author yycstart
 * @create 2020-08-25 11:10
 */
public class CommonUtil {
    public static int update(Connection connection,String sql,Object...args) throws SQLException, IOException, ClassNotFoundException {
        PreparedStatement preparedStatement = null;
        try {
            connection = JdbcUtil.getConnection();//获取连接对象
            preparedStatement = connection.prepareStatement(sql);

            //批量统一替换SQL中的？
            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i+1,args[i]);
            }

            int rows = preparedStatement.executeUpdate(); //执行这个SQL
            return rows;
        }finally {
            JdbcUtil.close(null,preparedStatement);
        }

    /*public static int update(String sql,Object...args) throws SQLException, IOException, ClassNotFoundException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JdbcUtil.getConnection();//获取连接对象
            preparedStatement = connection.prepareStatement(sql);

            //批量统一替换SQL中的？
            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i+1,args[i]);
            }

            int rows = preparedStatement.executeUpdate(); //执行这个SQL
            return rows;
        }finally {
            JdbcUtil.close(connection,preparedStatement);
        }*/
    }
}
