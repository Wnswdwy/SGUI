package com.nswdwy_yu.java;

/**
 * @author yycstart
 * @create 2020-08-04 18:57
 */
public class Test {
    @org.junit.Test
    public void method1() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//  true
    }



}
