package com.nswdwy_yu.exer;

/**
 * @author yycstart
 * @create 2020-08-04 11:49
 */
public class InstanceTest {
    public void method(Person e){
        System.out.println(e.getInfo());
    }
}
class Person {
    protected String name="person";
    protected int age=50;
    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }
}
class Student extends Person {
    protected String school="pku";
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}
class Graduate extends Student{
    public String major="IT";
    public String getInfo()
    {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}