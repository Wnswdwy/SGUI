package com.nswdwy_yu5.test02;

/**
 * @author yycstart
 * @create 2020-08-05 20:53
 * 对银行来说，可添加 Bank 类。 Bank 对象跟踪自身与其客户间的关系。用 Customer 对象的数组实现这个集合化的关系。还要保持一个整数属性来跟踪 银 行当前有多少客户。
 *
 * a. 创建 Bank 类
 *
 * b. 为 Bank 类 增 加 两 个 属 性 ： customers(Customer对象的数组 ) 和 numberOfCustomers(整数，跟踪下一个 customers 数组索引)
 *
 * c. 添加公有构造器，以合适的最大尺寸（至少大于 5）初始化 customers 数组。
 *
 * d. 添加 addCustomer 方法。该方法必须
 *
 * e. 添加 getNumOfCustomers 访问方法，它返回 numberofCustomers 属 性值。
 *
 * f. 添加 getCustomer方法。它返回与给出的index参数相关的客户。
 *
 * g. 编译并运行 TestBanking 程序。可以看到下列输出结果：
 *  Customer [1] is Simms,Jane
 *  Customer [2] is Bryant,Owen
 *  Customer [3] is Soley,Tim
 *  Customer [4] is Soley,Maria
 *
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;
    //以合适的最大尺寸（至少大于 5）初始化 customers 数组。
    public Bank(){
        customers = new Customer[10];
    }

    /**
     * 依照参数（姓，名）构造一个新的 Customer
     * 对象然后把它放到 customer 数组中。
     * 还必须把 numberofCustomers 属性的值加 1。
     * @param f
     * @param l
     */
    public void addCustomer(String f,String l){
        Customer customer = new Customer(f,l);
        customers[numberOfCustomer++] = customer;
    }

    /**
     * 它返回 numberofCustomers 属 性值。
     * @return numberofCustomers 属 性值。
     */
    public int getNumOfCustomers(){
            return numberOfCustomer;
    }

    /**
     * 它返回与给出的index参数相关的客户。
     * @return  返回与给出的index参数相关的客户。
     */
    public Customer getCustomer(int index){
        return customers[index];
    }

}
