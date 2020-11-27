package com.nswdwy.test.account1;

/**
 * @author yycstart
 * @create 2020-08-19 18:37
 */
public class Desposit implements Runnable {
    private Account account;
    private Withdraw withdraw;
    private int desnum = 1;

    public Desposit(Account account) {
        this.account = account;
    }

    public Desposit(Account account, Withdraw withdraw, int desnum) {
        this.account = account;
        this.withdraw = withdraw;
        this.desnum = desnum;
    }

    public Desposit() {
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Withdraw getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(Withdraw withdraw) {
        this.withdraw = withdraw;
    }

    public int getDesnum() {
        return desnum;
    }

    public void setDesnum(int desnum) {
        this.desnum = desnum;
    }

    @Override
    public void run() {
            boolean istrue = true;
//        loop:for ( desnum = 1; desnum <= 5; desnum++) {
        while(istrue && desnum <= 5){

            synchronized ("") {
                int money = (int)(Math.random() * 500);
                getAccount().setBalance(getAccount().getBalance() + money );
                System.out.println("第" + desnum++ + "次存钱" + money + "," +
                        Thread.currentThread().getName() + ":" + +getAccount().getBalance());
                "".notify();

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    "".wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
