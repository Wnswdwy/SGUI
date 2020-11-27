package com.nswdwy_yu4.test;

/**
 * @author yycstart
 * @create 2020-08-05 20:56
 */
public class BankingTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Add Customer Jane, Simms
        bank.addCustomer("Jane","Simms");
        //Add Customer Owen, Bryant
        bank.addCustomer("Owen","Bryant");
        // Add Customer Tim, Soley
        bank.addCustomer("Tim","Soley");
        // Add Customer Maria, Soley
        bank.addCustomer("Maria","Soley");
        for ( int i = 0; i < bank.getNumOfCustomers(); i++ ) {
            Customer customer = bank.getCustomer(i);

            System.out.println("Customer [" + (i+1) + "] is "
                    + customer.getLastName()
                    + ", " + customer.getFirstName());
        }
    }
}
