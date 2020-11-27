package nswdwy_yu.test02;

/**
 * @author yycstart
 * @create 2020-08-02 18:31
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;  //获得账户

    public Customer(String f,String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account acct) {
        this.account = acct;
    }
}
