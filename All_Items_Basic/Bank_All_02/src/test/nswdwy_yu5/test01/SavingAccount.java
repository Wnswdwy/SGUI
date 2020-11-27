package test.nswdwy_yu5.test01;

import test.nswdwy_yu5.test.Account;

/**
 * @author yycstart
 * @create 2020-08-06 10:38
 */
public class SavingAccount extends Account {
    private double interestRate;

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
