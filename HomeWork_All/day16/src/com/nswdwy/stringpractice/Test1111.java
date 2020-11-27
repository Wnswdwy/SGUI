package com.nswdwy.stringpractice;

/**
 * @author yycstart
 * @create 2020-08-13 17:16
 */
public class Test1111 {
    public static void main(String[] args) {
        String s = "   HelloJava.java";
        System.out.println(s.replace("Java", "****"));
        System.out.println(s.replaceFirst("Java", "****"));
    }
}
