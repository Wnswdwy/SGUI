package com.nswdwy.test02;


/**
 * @author yycstart
 * @create 2020-08-11 10:50
 */
public class Test02 {
    public static void main(String[] args) {
        MyDate date3 = new MyDate(2020,12,5);
        MyDate date4 = new MyDate(2020,11,20);
        System.out.println(date3.equals(date4));
        System.out.println(date3.hashCode());
        System.out.println(date4.hashCode());
    }

}
