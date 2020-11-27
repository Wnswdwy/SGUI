package test.nswdwy_yu5.test;

/**
 * @author yycstart
 * @create 2020-08-06 10:38
 */
public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double balance, double interest_rate) {
        super(balance);
        this.interestRate = interest_rate;
    }
}
