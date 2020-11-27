package com.nswdwy.test04;

/**
 * @author yycstart
 * @create 2020-08-18 16:48
 *
 * 银行有一个账户Account包含属性name, balance
 * 写一个普通 类Deposit实现Runnable, 在run方法中存钱
 * 有两个柜台(线程)分别同时向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。睡眠10毫秒
 *
 * 问题：该程序是否有安全问题，如果有，如何解决？
 *
 * 扩展练习 :
 * 一个柜台Deposit存3000元, 每次存1000,存3次
 * 另一个柜台Withdraw取3000元, 每次取1000,取3次
 * 【提示】
 * 1，明确哪些代码是多线程运行代码，须写入run()方法
 * 2，明确什么是共享数据。
 * 3，明确多线程运行代码中哪些语句是操作共享数据的。
 */

public class Account {
    private String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }


    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
