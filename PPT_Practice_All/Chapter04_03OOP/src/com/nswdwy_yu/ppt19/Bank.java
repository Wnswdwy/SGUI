package com.nswdwy_yu.ppt19;

import com.sun.org.apache.bcel.internal.generic.BALOAD;

/**
 * @author yycstart
 * @create 2020-08-05 15:08
 *编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”，
 * 定义封装这些属性的方法。账号要自动生成。
 * 编写主类，使用银行账户类，输入、输出3个储户的上述信息。
 * 考虑：哪些属性可以设计成static属性。
 */
public class Bank {
    private static int id = 1001;
    private int password = 1111;
    private double balance;
    private static  double annualInterestRate = 0.015;

    public Bank(){
        id++;
        this.password = password;
    }

    public static int getId() {
        return id;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id= " + id +
                ",password=" + password +
                ", balance=" + balance +
                '}';
    }
}
