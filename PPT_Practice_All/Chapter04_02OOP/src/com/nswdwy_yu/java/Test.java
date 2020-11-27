package com.nswdwy_yu.java;

/**
 * @author yycstart
 * @create 2020-08-04 11:22
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Man(12);
        Man p2 = (Man)p1;
        p1.eat();
        p2.eat();
    }


}
