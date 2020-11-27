package test.nswdwy_yu5.test;

/**
 * @author yycstart
 * @create 2020-08-05 20:17
 */
public class Customer extends Account {
    private  String firstName;
    private String lastName;
    private Account account;
    public Customer(){}
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        System.out.print("Checking Account: current balance is");
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
