package com.nswdwy_yu.test02;

/**
 * @author yycstart
 * @create 2020-08-03 18:09
 * 写一个用户程序测试CheckAccount类。在用户程序中，
 * 创建一个账号为1122、余额为20000、年利率4.5%，可透支限额为5000元的CheckAccount对象。
 *  * 使用withdraw方法提款5000元，并打印账户余额和可透支额。
 *  * 再使用withdraw方法提款18000元，并打印账户余额和可透支额。
 *  * 再使用withdraw方法提款3000元，并打印账户余额和可透支额。
 *
 * 提示：
 * （1）	子类CheckAccount的构造方法需要将从父类继承的3个属性和子类自己的属性全部初始化。
 * （2）	父类Account的属性balance被设置为private，
 * 但在子类CheckAccount的withdraw方法中需要修改它的值，
 * 因此应修改父类的balance属性，定义其为protected。
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122,20000,0.0045,5000);
        checkAccount.withdraw(5000);
        checkAccount.withdraw(18000);
        checkAccount.withdraw(3000);
    }
}
