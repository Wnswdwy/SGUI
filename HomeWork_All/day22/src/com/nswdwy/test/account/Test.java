package com.nswdwy.test.account;

/**
 * @author yycstart
 * @create 2020-08-19 18:40
 */
public class Test {
    public static void main(String[] args) {

        Account account = new Account("萧峰",100);
        Runnable runner1 = new Withdraw(account);
        Runnable runner2 = new Desposit(account);
        Thread thread1 = new Thread(runner1);
        Thread thread2 = new Thread(runner2);
        thread1.setName("柜台取钱后余额为：");
        thread2.setName("柜台存钱后余额为：");
        thread2.start();
        thread1.start();

    }
}
