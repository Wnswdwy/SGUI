package com.nswdwy_yu.test02;

/**
 * @author yycstart
 * @create 2020-08-03 17:56
 * 创建Account类的一个子类CheckAccount代表可透支的账户，
 * 该账户中定义一个属性overdraft代表可透支限额。在CheckAccount类中重写withdraw方法，其算法如下：
 * 如果（取款金额<账户余额），
 * 可直接取款
 * 如果（取款金额>账户余额），
 * 计算需要透支的额度
 * 判断可透支额overdraft是否足够支付本次透支需要，如果可以
 * 	将账户余额修改为0，冲减可透支金额
 * 如果不可以
 * 	提示用户超过可透支额的限额
 */
public class CheckAccount extends Account {
    double overdraft;//代表可透支限额
    public CheckAccount(int id, double balance,double annualInterestRate,double override){
        super(id,balance,annualInterestRate);
        this.overdraft = override;

    }

    public void withdraw (double amount){
        if(amount < super.balance ){
            balance -= amount;
            System.out.println("您的账户余额为：" + balance );
            System.out.println("您的可透支的限额"  + overdraft + "\n");
        }else if(overdraft > (amount - balance)){
            overdraft -=(amount - balance);
            balance = 0;
            System.out.println("您的账户余额为：" + balance );
            System.out.println("您的可透支的限额"  + overdraft + "\n");
        }else{
            System.out.println("超过可透支的限额！\n");
            System.out.println("您的账户余额为：" + balance );
            System.out.println("您的可透支的限额"  + overdraft + "\n");
        }
    }
}
