package nswdwy_yu.test01;

/**
 * @author yycstart
 * @create 2020-08-01 14:19
 *
 * （1）	创建一个Customer ，名字叫 Jane Smith, 他有一个账号为1000，
 * 余额为2000元，年利率为 1.23％ 的账户。
 * （2）	对Jane Smith操作。
 * 存入 100 元，再取出960元。再取出2000元。
 * 打印出Jane Smith 的基本信息
 */
public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");
        Account account = new Account(1000,2000,0.0123);
        customer.setAccount(account);
        customer.getAccount();
        account.deposit(100);
        account.withdraw(960);
        account.withdraw(2000);

        System.out.println("Customer ["+customer.getFirstName() + customer.getLastName() +
                "] has a account : id is "+  account.getId() + ",annualInterestRate is " +
                account.getAnnualInterestRate()+ ",balance is " + customer.getAccount().getBalance());
    }
}//Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23％, balance is 1140.0
