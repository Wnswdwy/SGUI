package test.nswdwy_yu5.test01;

import test.nswdwy_yu5.test.Account;

/**
 * @author yycstart
 * @create 2020-08-05 22:29
 *
 */
public class CheckingAccount extends Account {
    private double overdraghtProtected;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double init_balance, double protect) {
        super(init_balance);
        this.overdraghtProtected = protect;
    }

    public double withdraw(double amt) {

        if (amt < balance) {
            balance -= amt;
            return balance;
        } else {
            if (amt <= (overdraghtProtected + balance)) {
                balance = 0;
                overdraghtProtected -= (amt - balance);
            }
            return balance;
        }
    }
}
