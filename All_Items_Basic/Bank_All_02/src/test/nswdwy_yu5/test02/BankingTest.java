package test.nswdwy_yu5.test02;

/**
 * @author yycstart
 * @create 2020-08-05 20:56
 */
public class BankingTest {
    public static void main(String[] args) {
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");
        Bank bank = new Bank();



        /* Customer : SimmsJane,
                Savings Account: current balance is ￥500.00
                Checking Account: current balance is ￥200.00
        */
        Account account1 = new CheckingAccount(500.00);
        bank.addCustomer("Jane","Simms");
        System.out.println("Savings Account: current balance is" + account1.getBalance());

        System.out.println("Check Account: current balance is" + account1.getBalance());


        /* Customer : Owen, Bryant,
                Checking Account: current balance is ￥200.00
        */
        bank.addCustomer("Owen","Bryant");
        // Add Customer Tim, Soley
        /* Customer : Soley Tim
                Savings Account: current balance is ￥1500.00
                Checking Account: current balance is ￥200.00
        */
        bank.addCustomer("Tim","Soley");
        /* Customer : Soley Maria
                Savings Account: current balance is ￥200.00
                Checking Account: current balance is ￥150.00
        */
        bank.addCustomer("Maria","Soley");
        for ( int i = 0; i < bank.getNumOfCustomers(); i++ ) {
            Customer customer = bank.getCustomer(i);

            System.out.println("Customer [" + (i+1) + "] is "
                    + customer.getLastName()
                    + ", " + customer.getFirstName());
        }
    }
}
