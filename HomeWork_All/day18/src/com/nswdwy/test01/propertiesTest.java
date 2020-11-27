package com.nswdwy.test01;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author yycstart
 * @create 2020-08-14 18:15
 *
 * 1 创建一个配置文件, 用properties读取文件中的配置, 打印输出一些参数值.
 */
public class propertiesTest {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("D:\\_StudyAll\\Java_All\\IDEA_All\\" +
                "_MyFiles\\SGUI\\HomeWork_All\\day18\\src\\test.properties"));
        String name = properties.getProperty("user");
        System.out.println(name);
    }
}
