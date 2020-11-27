package com.nswdwy.jdbc.test;

import com.nswdwy.jdbc.javabean.Customer;
import com.nswdwy.jdbc.util.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author yycstart
 * @create 2020-08-25 16:43
 */
public class DBUtilTest {
    @Test
    public void test() throws SQLException, IOException, ClassNotFoundException {
        QueryRunner queryRunner = new QueryRunner();
        Connection connection = JdbcUtil.getConnection();
        String sql  = "select * from customer where id > ?";
        BeanListHandler<Customer> customerBeanListHandler = new BeanListHandler<>(Customer.class);
        List<Customer> list = queryRunner.query(connection, sql, customerBeanListHandler, 1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
