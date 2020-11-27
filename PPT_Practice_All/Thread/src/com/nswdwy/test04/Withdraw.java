package com.nswdwy.test04;

/**
 * @author yycstart
 * @create 2020-08-19 10:04
 */
public class Withdraw implements Runnable{
    private Account account;

    public Withdraw(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for(int i = 0; i < 3; i++){
            synchronized ("") {
                account.setBalance(getAccount().getBalance() - 1000);
                System.out.println(Thread.currentThread().getName() + ":" + getAccount());
            }
        }
    }
}
