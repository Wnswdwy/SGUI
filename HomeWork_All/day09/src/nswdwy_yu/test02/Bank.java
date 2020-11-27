package nswdwy_yu.test02;

/**
 * @author yycstart
 * @create 2020-08-02 18:37
 */
public class Bank {
    private Customer[] customers; //创建顾客数组
    private int numberOfCustomer; //顾客数目

    public Bank() {
        customers = new Customer[10];
    }
    public void addCustomer(String f , String l){
        Customer customer = new Customer(f,l);
        customers[numberOfCustomer++] = customer;
    }
    public int getNumberOfCustomer(){
        return numberOfCustomer;
    }
    public Customer getCustomer(int index){
            if(index >= 0 && index < numberOfCustomer ){
                return customers[index];
            }else{
                return null;
        }
    }

}
