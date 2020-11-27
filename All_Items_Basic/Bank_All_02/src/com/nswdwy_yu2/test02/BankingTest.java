package com.nswdwy_yu2.test02;

/**
 * @author yycstart
 * @create 2020-08-05 20:15
 * Creating the customer Jane Smith.
 * Creating her account with a 500.00 balance.
 * Withdraw 150.00
 * Deposit 22.50
 * Withdraw 47.62
 * Customer [Smith, Jane] has a balance of 324.88
 */
public class BankingTest {
    public static void main(String[] args) {

        //System.out.println("Creating the customer Jane Smith.");
        Customer customer = new Customer("Jane","Smith");
        // Create an account that can has a 500.00 balance.
        Account account = new Account(500.00);
        customer.setAccount(account);
        //Withdraw 150.00
        customer.getAccount().withdraw(150.00);
        //Deposit 22.50
        customer.getAccount().deposit(22.50);
        //Withdraw 47.62
        customer.getAccount().withdraw(47.62);
        System.out.println("Customer [" + customer.getLastName()
                + ", " + customer.getFirstName()
                + "] has a balance of " + account.getBalance());
    }
}
