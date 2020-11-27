package com.wnswdwy;

/**
 * @author yycstart
 * @create 2020-08-04 9:10
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public CustomerView() {
        Customer cust = new Customer("赵四", '男', 26, "156987562", "12331655@qq.com");
        customerList.addCustomer(cust);
    }

    //    public void enterMainMenu()
//    用途：显示主菜单，响应用户输入，根据用户操作分别调用其他相应的成员方法（如addNewCustomer），
//    以完成客户信息处理。
    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("-----------------客户信息管理软件-----------------\n");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 修 改 客 户");
            System.out.println("                   3 删 除 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   5 退       出\n");
            System.out.println("                   请选择(1-5)：");
            char menu = CMUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("确认是否退出(Y/N)：");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                        break;
                    }
            }
        }
    }


    //定义方法来完成添加客户
    private void addNewCustomer() {
        System.out.println("---------------------添加客户---------------------\n");
        System.out.print("姓名：");
        String name = CMUtility.readString(15);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(11);
        System.out.print("邮箱：");
        String email = CMUtility.readString(25);
        Customer cust = new Customer(name, gender, age, phone, email);
        boolean isAddSucceed = customerList.addCustomer(cust);
        if (isAddSucceed) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("---------------------无法添加---------------------");
        }
    }

    private void modifyCustomer() {
        System.out.println("---------------------修改客户---------------------");
        int number;
        Customer customer;
        while (true) {
            System.out.println("请选择待修改客户编号(-1退出)：");
            number = CMUtility.readInt();
            if (number == -1) {
                return;
            }
            customer = customerList.getCustomer(number - 1);
            if (customer == null) {
                System.out.println("无法找到指定客户");
            } else {
                break;
            }
        }
        //修改用户信息
        System.out.print("姓名：");
        String name = CMUtility.readString(15, customer.getName());
        System.out.print("性别：");
        char gender = CMUtility.readChar(customer.getGender());
        System.out.print("年龄：");
        int age = CMUtility.readInt(customer.getAge());
        System.out.print("电话：");
        String phone = CMUtility.readString(11, customer.getPhone());
        System.out.print("邮箱：");
        String email = CMUtility.readString(25, customer.getEmail());
        customer = new Customer(name, gender, age, phone, email);
        boolean isModify = customerList.replaceCustomer(number - 1, customer);
        if (isModify) {
            System.out.println("---------------------修改完成---------------------");
        } else {
            System.out.println("---------------------修改失败---------------------");
        }

    }

    //定义方法来删除客户
    private void deleteCustomer() {
        System.out.println("---------------------删除客户---------------------");
        int number;
        while (true) {
            System.out.println("请选择待修改客户编号(-1退出)：");
            number = CMUtility.readInt();
            if (number == -1) {
                return;
            }
            Customer customer = customerList.getCustomer(number - 1);
            if (customer == null) {
                System.out.println("找不到指定客户");
            } else {
                break;
            }
        }
        System.out.print("确认是否删除(Y/N)：");
        char select = CMUtility.readConfirmSelection();
        if (select=='Y'){
            boolean isDeleted = customerList.deleteCustomer(number - 1);
            if (isDeleted){
                System.out.println("---------------------删除完成---------------------");
            }else{
                System.out.println("---------------------删除失败---------------------");
            }
        }

    }

    //定义方法来完成遍历获得的所有客户记录
    private void listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------\n");
        Customer[] custs = customerList.getAllCustomers();
        if (custs.length == 0) {
            System.out.println("客户不存在");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t邮箱");
            for (int i = 0; i < custs.length; i++) {
                System.out.println(i + 1 + "\t\t" + custs[i].getName() + "\t" +
                        custs[i].getGender() + "\t\t" + custs[i].getAge() + "\t\t\t" + custs[i].getPhone() + "\t" + custs[i].getEmail());

            }

            System.out.println("-------------------------客户列表完成-------------------------\n");
        }
    }

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }
}
