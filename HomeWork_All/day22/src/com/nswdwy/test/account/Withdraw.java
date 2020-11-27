package com.nswdwy.test.account;

/**
 * @author yycstart
 * @create 2020-08-19 18:34
 */
public class Withdraw implements Runnable{
    private Account account;

    public Withdraw(Account account) {
        this.account = account;
    }

    public Withdraw() {
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        int withdrawNumber = 1;
        while(true){
            synchronized ("") {
                int number = (int) (Math.random() * 1000);
                if (getAccount().getBalance() < number) {
                    System.out.println("第" + withdrawNumber++ +"次取钱 "+ number + "失败,余额不足,余额为：" +
                            getAccount().getBalance() + ",请先存钱");
//                    witnum--;
                    "".notify();
                    try {
                        "".wait();
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        continue;
                    }catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                }else {
                    getAccount().setBalance(getAccount().getBalance() - number);
                    System.out.println("第" + withdrawNumber++ + "次取钱成功," + Thread.currentThread().getName() + ": " + getAccount().getBalance());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }
}
