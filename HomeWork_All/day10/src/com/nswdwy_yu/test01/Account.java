package com.nswdwy_yu.test01;

/**
 * @author yycstart
 * @create 2020-08-03 17:25
 *
 * 写一个名为Account的类模拟账户。该类的属性和方法如下图所示。
 * 该类包括的属性：账号id，余额balance，年利率annualInterestRate；
 * 包含的方法：访问器方法（getter和setter方法），返回月利率的方法getMonthlyInterest()，
 * 取款方法withdraw()，存款方法deposit()。
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    public Account (int id, double balance, double annualInterestRate ){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    //取款方法withdraw()
    public void withdraw (double amount){
        if(balance < amount){
            System.out.println("余额不足！");
        }else{
            balance -= amount;
            System.out.println("您的账户余额为：" + balance + "\n");
        }
    }
    //存款方法deposit()
    public void deposit (double amount){
        if(amount > 0){
            balance+=amount;
            System.out.println("你的账户余额为：" + balance);
        }else{
            System.out.println("请输入正确的存款金额！");
        }
    }

}
