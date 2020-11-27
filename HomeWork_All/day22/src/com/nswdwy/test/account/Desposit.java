package com.nswdwy.test.account;

/**
 * @author yycstart
 * @create 2020-08-19 18:37
 */
public class Desposit implements Runnable {
    private Account account;


    public Desposit(Account account) {
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

        int despositeNumber = 1;
        while(true){
            synchronized ("") {
                int money = (int)(Math.random() * 500);
                getAccount().setBalance(getAccount().getBalance() + money );
                System.out.println("第" + despositeNumber++ + "次存钱" + money + "," +
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
