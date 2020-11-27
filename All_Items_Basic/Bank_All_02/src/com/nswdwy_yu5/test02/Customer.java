package com.nswdwy_yu5.test02;

/**
 * @author yycstart
 * @create 2020-08-05 20:17
 */
public class Customer extends Account {
    private  String firstName;
    private String lastName;
    private CheckingAccount checkingAccount;
    private SavingAccount savingAccount;
    public Customer(){}
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
//getSaving 和 getChecking，这两个方法分别返回储蓄和支票总数。
    public CheckingAccount getChecking(){
        return checkingAccount;
    }
    public SavingAccount getSaving(){
        return savingAccount;
    }
//包含两个相反的方法：SetSaving 和 setChecking，
// 这两个方法分别为savingAccount 和 checkingAccount 这两个关联属性赋值。
    public void setSaving(SavingAccount savingAccount){
        this.savingAccount = savingAccount;
    }
    public void setChecking(CheckingAccount checkingAccount){
        this.checkingAccount = checkingAccount;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


}
