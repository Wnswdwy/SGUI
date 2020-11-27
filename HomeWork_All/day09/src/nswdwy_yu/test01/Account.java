package nswdwy_yu.test01;

/**
 * @author yycstart
 * @create 2020-08-01 14:08
 *
 * 账号id，余额balance，年利率annualInterestRate；
 * 包含的方法：访问器方法（getter和setter方法），
 * 取款方法withdraw()，存款方法deposit()。
 * private int id
 * private double balance
 * private double annualInterestRate
 * public com.nswdwy_yu.test01.Account (int id, double balance, double annualInterestRate )
 * public int getId()
 * public double getBalance()
 * public double getAnnualInterestRate()
 * public void setId( int id)
 * public void setBalance(double balance)
 * public void setAnnualInterestRate(double annualInterestRate)
 * public void withdraw (double amount)//取钱
 * public void deposit (double amount)//存钱
 */
public class Account {
    private int id; //账号id
    private double balance;//余额balance
    private double annualInterestRate;//年利率annualInterestRate

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount) {//取钱
        if(balance < amount){
            System.out.print("余额不足！\t");
            System.out.println("您的余额为：" + balance);
        }else{
            balance -= amount;
            System.out.println("成功取款\t" + amount+ "\t您的账户还有余额为：" + balance);
        }
    }

    public void deposit(double amount) {//存钱
        if(amount < 0){
            System.out.println("请存入正确的金额！");
        }else{
            balance += amount;
            System.out.println("成功存入\t" + amount + "\t账户余额为："+ balance);
        }
    }
}