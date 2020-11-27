package com.nswdwy_yu2.test02;

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
 * 3．打开TestBanking.java文件，按提示完成编写，并编译 TestBanking.java 文件。
 *
 * 4． 运行 TestBanking 类。可以看到下列输出结果：
 *
 * Creating an account with a 500.00 balance
 * Withdraw 150.00
 * Deposit 22.50
 * Withdraw 47.62
 * The account has a balance of 324.88
 */
public class Account {
    private double balance;
    Account(){}
    Account(double init_balance){
        this.balance = init_balance;
    }
    //声明一个公有方法 getBalance，该方法用于获取账户余额。
    public double getBalance(){
        return  balance;
    }
   //声明一个公有方法 deposit,该方法向当前余额增加金额。
    public void deposit(double amt){
        if(balance > 0){
            balance += amt;
            System.out.println("Deposit\t" + amt);
        }
    }
    //声明一个公有方法 withdraw 从当前余额中减去金额
    public void withdraw(double amt){
        if(balance > amt){
            balance -= amt;
            System.out.println("Withdraw\t" + amt);
        }else {
            System.out.println("余额不足！");
        }
    }
}
