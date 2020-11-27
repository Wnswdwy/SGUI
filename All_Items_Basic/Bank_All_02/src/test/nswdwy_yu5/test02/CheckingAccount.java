package test.nswdwy_yu5.test02;

/**
 * @author yycstart
 * @create 2020-08-05 22:29
 *
 * 1． CheckingAccount 类必须扩展 Account 类
 * 2． 该类必须包含一个类型为 double 的 overdraftProtection 属性。
 * 3． 该类必须包含一个带有参数（balance）的共有构造器。该构造器必须通过调 用 super(balance)将 balance 参数传递给父类构造器。
 * 4． 给类必须包括另一个带有两个参数（balance 和 protect）的公有构造器。
 * 该构造器必须通过调用 super(balance)并设置 overdragtProtection 属性，
 * 将 balance 参数传递给父类构造器。
 * 5． CheckingAccount 类必须覆盖 withdraw 方法。此方法必须执行下列检查。如果当前余额足够弥补取款 amount,则正常进行。
 * 如果不够弥补但是存在透支 保护，则尝试用 overdraftProtection 得值来弥补该差值（balance-amount）.
 * 如果弥补该透支所需要的金额大于当前的保护级别。则整个交易失败，但余额未受影响。
 * 6．
 */
public class CheckingAccount extends Account {
    double overdraftProtection;
    public CheckingAccount(double balance){
        super(balance);
    }
    //带有参数（balance）的共有构造器。该构造器必须通过调用 super(balance)将 balance 参数传递给父类构造器。
    public CheckingAccount(double balance, double protect){
        super(balance);
        this.overdraftProtection = protect;
    }
    //如果当前余额足够弥补取款 amount,则正常进行。
    // * 如果不够弥补但是存在透支保护，则尝试用 overdraftProtection 得值来弥补该差值（balance-amount）.
    // * 如果弥补该透支所需要的金额大于当前的保护级别。则整个交易失败，但余额未受影响。
    public double withdraw(double amt) {

        if (amt < balance) {
            balance -= amt;
            return balance;
        } else {
            if (amt <= (overdraftProtection + balance)) {
                balance = 0;
                overdraftProtection -= (amt - balance);
            }
            return balance;
        }
    }
}
