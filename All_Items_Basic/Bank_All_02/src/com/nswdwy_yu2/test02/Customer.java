package com.nswdwy_yu2.test02;

/**
 * @author yycstart
 * @create 2020-08-05 20:17
 */
public class Customer extends  Account{
    private  String firstName;
    private String lastName;
    private  Account account;

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
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
