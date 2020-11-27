package com.nswdwy_yu.myself;

/**
 * @author yycstart
 * @create 2020-08-04 9:16
 */
public class CustomerList {
    Customer[] customers;//用来保存客户对象的数组
    int total ;          //记录已保存客户对象的数量
    //该类至少提供以下构造器和方法：

    /**
     * 用途：构造器，用来初始化customers数组
     * @param totalCustomer 指定customers数组的最大空间
     */
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];

    }

    /**
     *用途：将参数customer添加组中最后一个客户对象记录之后
     * @param customer 指定要添加的客户对象
     * @return 添加成功返回true；false表示数组已满，无法添加
     */
    public boolean addCustomer(Customer customer){
        if(customers.length < total){
            return false;
        }else{
            customers[total++] = customer;
            return true;
        }
    }

    /**
     * 用途：用参数customer替换数组中由index指定的对象
     * @param index  index指定所替换对象在数组中的位置，从0开始
     * @param cust   指定替换的新客户对象
     * @return       替换成功返回true；false表示索引无效，无法替换
     */
    public boolean replaceCustomer(int index, Customer cust){
        if(index >= 0 && index < total){
                customers[index] = cust;
                return true;
        }
            return false;
    }

    /**
     * 用途：从数组中删除参数index指定索引位置的客户对象记录
     * @param index index指定所删除对象在数组中的索引位置，从0开始
     * @return      删除成功返回true；false表示索引无效，无法删除
     */
    public boolean deleteCustomer(int index){
        if(index >= 0 && index < total){
            for (int i = 0; i < total; i++) {
                customers[index]  = customers[index + 1];
            }
            customers[--total] = null;
            return true;
        }
        return false;
    }

    /**
     * 用途：返回数组中记录的所有客户对象
     * @return  Customer[] 数组中包含了当前所有客户对象，该数组长度与对象个数相同。
     */
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 用途：返回参数index指定索引位置的客户对象记录
     * @param index index指定所要获取的客户在数组中的索引位置，从0开始
     * @return       封装了客户信息的Customer对象
     */
    public Customer getCustomer(int index){
        if(index >= 0 && index < total){
            return customers[index];
        }
        return null;
    }
    public int getTotal(){
        return total;
    }

}
