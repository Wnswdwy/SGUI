package com.nswdwy_yu.ppt19;

/**
 * @author yycstart
 * @create 2020-08-05 15:20
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setPassword(1234);
        bank.setBalance(1200);
        System.out.println(bank);
        Bank bank1 = new Bank();
        bank1.setPassword(4567);
        bank1.setBalance(1300);
        System.out.println(bank1);

    }
}
