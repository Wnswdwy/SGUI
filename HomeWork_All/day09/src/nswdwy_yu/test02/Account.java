package nswdwy_yu.test02;

/**
 * @author yycstart
 * @create 2020-08-02 18:15
 */
public class Account {
    private double balance;

    public Account(double init_balance) {
        balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }
    //存款
    public void deposit(double amt){
        if(amt > 0){
            balance += amt;
            System.out.println("成功存入"+ amt + "\t当前余额为：" + balance);
        }else{
            System.out.println("请输入正确的存款金额！");
        }
    }
    public void withdraw(double amt) {
        if (balance > amt) {
            balance -= amt;
            System.out.println("成功取款" + amt + "余额为：" + balance);
        } else {
            System.out.println("余额不足!");
        }
    }
}
