package com.nswdwy.test04;

/**
 * @author yycstart
 * @create 2020-08-18 16:52
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("Bob",1000);
        Runnable runner = new Deposit(account);
        Thread thread = new Thread(runner);
        thread.setName("柜台1");
        Thread thread1 = new Thread(runner);
        thread1.setName("柜台2");
        thread.start();
        thread1.start();
    }
}
