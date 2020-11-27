package com.nswdwy_yu3.test;

/**
 * @author yycstart
 * @create 2020-08-05 20:38
 *
 *

2． 在 exercise3 主目录编译并运行 TestBanking 程序，将看到下列输出;

Creating the customer Jane Smith.
Creating her account with a 500.00 balance.
Withdraw 150.00: true
Deposit 22.50: true
Withdraw 47.62: true
Withdraw 400.00: false
Customer [Smith, Jane] has a balance of 324.88
 */
public class BankingTest {
    public static void main(String[] args) {

        Customer customer = new Customer("Smith","Jane");
        System.out.println("Creating her account with a 500.00 balance.");
        Account  account = new Account(500.00);
        customer.setAccount(account);
        System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
        System.out.println("Deposit 22.50: " + account.deposit(22.50));
        System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
        System.out.println("Withdraw 400.00: " + account.withdraw(400.00));

        // Print out the final account balance
        System.out.println("Customer [" + customer.getLastName()
                + ", " + customer.getFirstName()
                + "] has a balance of " + account.getBalance());
    }
}
