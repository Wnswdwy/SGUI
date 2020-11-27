package com.nswdwy.test01;

/**
 * @author yycstart
 * @create 2020-08-11 10:46
 */
public class HashTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2020,12,5);
        MyDate date2 = new MyDate(2020,11,20);
        System.out.println(date1.equals(date2));
        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode());
    }
}
