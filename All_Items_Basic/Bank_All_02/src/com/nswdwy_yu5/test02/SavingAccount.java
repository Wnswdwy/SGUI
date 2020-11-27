package com.nswdwy_yu5.test02;

/**
 * @author yycstart
 * @create 2020-08-06 10:38
 */
public class SavingAccount extends Account{
    private double interestRate;
    public SavingAccount(){}
    public SavingAccount(double balance, double interest_rate) {
        super(balance);
        this.interestRate = interest_rate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
