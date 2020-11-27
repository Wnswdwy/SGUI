package com.nswdwy.test05;

import java.sql.SQLOutput;

/**
 * @author yycstart
 * @create 2020-08-11 21:58
 * 5.声明3个字符串, 把第1个为参数创建成StringBuilder对象,
 * 把第2个串串接到末尾, 把第3个串插入到最开头.
 */
public class Test {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        String str1 = "aaaa   ";
        String str2 = "bbbb";
        String str3 = "cccc   ";
        System.out.println(str.append(str1).append(str2).insert(0,str3));
    }

}
