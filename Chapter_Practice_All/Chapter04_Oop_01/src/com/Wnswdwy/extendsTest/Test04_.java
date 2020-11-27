package com.Wnswdwy.extendsTest;

/**
 * @author yycstart
 * @create 2020-07-30 12:00
 */
public class Test04_ {
    public static void main(String[] args) {
        try {
            func();
            throw new Exception();
        } catch (Exception e) {
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static void func() {
        try {
//            System.out.println("A");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("B");
        }
    }
}