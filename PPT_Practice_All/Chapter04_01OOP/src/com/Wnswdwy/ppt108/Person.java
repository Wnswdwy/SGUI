package com.Wnswdwy.ppt108;

/**
 * @author yycstart
 * @create 2020-07-31 15:48
 *
 * setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
 * 在PersonTest类中实例化Person类的对象b，调用setAge()和getAge()方法，
 */
public class Person {
    private int age;

    public void setAge(int age){
        if(age < 0 || age > 130){
            System.out.println("输入不合法！！");
        }else{
           this.age = age;
        }
    }
    public int getAge(){
        return age;
    }
}
