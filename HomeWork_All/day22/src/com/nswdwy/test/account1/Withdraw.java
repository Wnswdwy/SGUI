package com.nswdwy.test.account1;

/**
 * @author yycstart
 * @create 2020-08-19 18:34
 */
public class Withdraw implements Runnable{
    private Account account;
    private Desposit desposit;
    private int witnum = 1;

    public Withdraw(Account account) {
        this.account = account;
    }


    public Withdraw(Account account, Desposit desposit, int witnum) {
        this.account = account;
        this.desposit = desposit;
        this.witnum = witnum;
    }

    public Withdraw() {
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Desposit getDesposit() {
        return desposit;
    }

    public void setDesposit(Desposit desposit) {
        this.desposit = desposit;
    }

    public int getWitnum() {
        return witnum;
    }

    public void setWitnum(int witnum) {
        this.witnum = witnum;
    }

    @Override
    public void run() {
//        loop:for (witnum = 1; witnum <= 5; witnum++) {
        boolean istrue = true;
        while(istrue && witnum <= 5 ){
            synchronized ("") {
                int number = (int) (Math.random() * 1000);
                if (getAccount().getBalance() < number) {
                    System.out.println("第" + witnum++ +"次取钱 "+ number + "失败,余额不足,余额为：" +
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
                    System.out.println("第" + witnum++ + "次取钱成功," + Thread.currentThread().getName() + ": " + getAccount().getBalance());
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
