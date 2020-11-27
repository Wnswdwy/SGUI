package com.nswdwy_yu5.test01;

import java.text.NumberFormat;/*
*
 * @author yycstart
 * @create 2020-08-05 20:56
*/

public class BankingTest {
    public static void main(String[] args) {
        NumberFormat currency_format = NumberFormat.getCurrencyInstance();
        Bank     bank = new Bank();
        Customer customer;

        // Create several customers and their accounts
        bank.addCustomer("Jane", "Simms");
        customer = bank.getCustomer(0);
        customer.addAccount(new SavingAccount(500.00, 0.05));

        customer.addAccount(new CheckingAccount(200.00, 400.00));

        bank.addCustomer("Owen", "Bryant");
        customer = bank.getCustomer(1);
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Tim", "Soley");
        customer = bank.getCustomer(2);
        customer.addAccount(new SavingAccount(1500.00, 0.05));
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Maria", "Soley");
        customer = bank.getCustomer(3);
        // Maria and Tim have a shared checking account
        customer.addAccount(bank.getCustomer(2).getAccount(1));
        customer.addAccount(new SavingAccount(150.00, 0.05));

        // Generate a report
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");

        for ( int cust_idx = 0; cust_idx < bank.getNumOfCustomers(); cust_idx++ ) {
            customer = bank.getCustomer(cust_idx);

            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName());

            for ( int acct_idx = 0; acct_idx < customer.getNumOfAccounts(); acct_idx++ ) {
                Account account = customer.getAccount(acct_idx);
                if (account instanceof SavingAccount){
                    SavingAccount savingsAccount= (SavingAccount)account;
                    String  account_type = "SavingsAccount";
                    System.out.println(account_type+": current balance is:￥"+account.getBalance());
                }if (account instanceof CheckingAccount){
                    String  account_type = "CheckingAccount";
                    System.out.println(account_type+": current balance is:￥"+account.getBalance());
                }



                // Determine the account type

            }
        }
    }
}
