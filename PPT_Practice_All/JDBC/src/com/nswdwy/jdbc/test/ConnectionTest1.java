package com.nswdwy.jdbc.test;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.nswdwy.jdbc.util.JdbcUtil;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author yycstart
 * @create 2020-08-25 10:38
 */
public class ConnectionTest1 {
    @Test
    public void test1() throws Exception {
        Properties properties = new Properties();
        InputStream is = ConnectionTest1.class.getClassLoader().getResourceAsStream("druid.properties");
        properties.load(is);
        is.close();
        //通过工厂配合配置完成连接池的创建，配置文件可以有多个参数设置
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();

    }
    @Test
    public void test(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JdbcUtil.getConnection();
            String sql = "insert into customer(name,age,gender,email) values (?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1,"王语嫣");
            preparedStatement.setInt(2,21);
            preparedStatement.setString(3,"女");
            preparedStatement.setString(4,"wangyuyan@163.com");

            int row = preparedStatement.executeUpdate();
            System.out.println(row + "row reflected");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.close(connection,preparedStatement);
        }
    }
}
