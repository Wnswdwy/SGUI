package com.nswdwy_yu.test01;

/**
 * @author yycstart
 * @create 2020-08-05 20:10
 */
public class BankingTest {
    public static void main(String[] args) {
        Account account = new Account(500.00);

        System.out.println("成功存入" + account.getBalance());

        account.withdraw(150.0);

        account.disposit(22.50);

        account.withdraw(47.62);

        System.out.println("The account has a balance of " + account.getBalance());
    }
}
