package com.nswdwy_yu5.test02;

/**
 * @author yycstart
 * @create 2020-08-05 22:29
 *
 */
public class CheckingAccount extends Account {
    private SavingAccount protectBy;

    //带有参数（balance）的共有构造器。该构造器必须通过调用 super(balance)将 balance 参数传递给父类构造器。
    public CheckingAccount(double balance){
        super(balance);
    }

    public CheckingAccount(double balance, SavingAccount protectBy){
        super(balance);
        this.protectBy = protectBy;
    }
    //如果当前余额足够弥补取款 amount,则正常进行。
    // * 如果不够弥补但是存在透支保护，则尝试用 overdraftProtection 得值来弥补该差值（balance-amount）.
    // * 如果弥补该透支所需要的金额大于当前的保护级别。则整个交易失败，但余额未受影响。
    public boolean withdraw(double amt) {

        if (amt <= balance) {
            balance -= amt;
            return true;
        }
       else if (protectBy != null&& protectBy.getBalance()>= (amt - balance)) {
            protectBy.withdraw(amt - balance);
            balance = 0;
            return true;
        } else {
            return false;
        }
    }

}
