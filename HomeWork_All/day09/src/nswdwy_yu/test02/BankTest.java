package nswdwy_yu.test02;

/**
 * @author yycstart
 * @create 2020-08-02 19:54
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Smith","Bob");
        bank.addCustomer("Smith","Jerry");
        System.out.println("银行客户的个数为：" + bank.getNumberOfCustomer());
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(200);
        bank.getCustomer(0).getAccount().deposit(300);
        System.out.println("余额为：" + bank.getCustomer(0).getAccount().getBalance());
    }
}
