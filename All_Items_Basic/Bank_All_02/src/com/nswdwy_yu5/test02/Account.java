package com.nswdwy_yu5.test02;

/**
 * @author yycstart
 * @create 2020-08-05 19:57
 *
 *  在 banking 包下创建 Account 类。该类必须实现上述 UML 框图中的模型。
 *  a. 声明一个私有对象属性：balance，这个属性保留了银行帐户的当前（或 即 时）余额。
 *  b. 声明一个带有一个参数（init_balance）的公有构造器，这个参数为 balance 属性赋值。
 *  c. 声明一个公有方法 getBalance，该方法用于获取账户余额。
 *  d. 声明一个公有方法 deposit,该方法向当前余额增加金额。
 *  e. 声明一个公有方法 withdraw 从当前余额中减去金额。
 *
 * a. 修改 deposit 方法返回 true（意味所有存款是成功的）。
 * b. 修改 withdraw 方法来检查提款数目是否大于余额。如果amt小于 balance,
 * 则从余额中扣除提款数目并返回 true，否则余额不变返回 false。
 */
public class Account {
    protected  double balance;
    Account(){}
    Account(double init_balance){
        this.balance = init_balance;
    }
    //声明一个公有方法 getBalance，该方法用于获取账户余额。
    public double getBalance(){
        return   balance;
    }

    //声明一个公有方法 deposit,该方法向当前余额增加金额。
    public boolean deposit(double amt){
            if(balance > 0) {
                balance += amt;
                return true;
            }
            return false;
    }
    //声明一个公有方法 withdraw 从当前余额中减去金额
    public boolean withdraw(double amt){
        if(balance >= amt){
            balance -= amt;
            return true;
        }
        return false;
    }
}
