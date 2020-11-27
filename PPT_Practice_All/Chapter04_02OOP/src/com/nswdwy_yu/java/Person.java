package com.nswdwy_yu.java;

/**
 * @author yycstart
 * @create 2020-08-04 10:05
 */
public class Person {
    String name;
    int age = 1;
    Person(){

    }
    Person(int age) {
        System.out.println("-------Person带参-----");
    }



    public void eat(){
        System.out.println("人要吃饭.....");
    }
}
