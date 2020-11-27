package com.nswdwy_yu.java;

/**
 * @author yycstart
 * @create 2020-08-04 11:21
 */
public class Man extends Person {
    int age = 0;

    Man(int age){
        this.age = age;
        System.out.println("------Man带参----------");
    }
//    public void eat(){
//        System.out.println("男人要吃营养高的....");
//    }
    public void earnMoney(){
        System.out.println("男人要赚钱.....");
    }
}
