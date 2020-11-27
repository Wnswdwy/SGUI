package com.nswdwy_yu6.test;

/**
 * @author yycstart
 * @create 2020-08-05 20:17
 */
public class Customer extends Account {
    private  String firstName;
    private String lastName;
    private Account[] accounts;
    private int numOfAccounts;
    public Customer(){}
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        accounts = new Account[5];
    }

    public int getNumOfAccounts() {
        return numOfAccounts;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public Account getAccount(int index){
        return accounts[index];
    }
    public void addAccount(Account account) {

        accounts[numOfAccounts++] = account;
}
}
