package com.nswdwy_yu.test02;


/**
 * @author yycstart
 * @create 2020-08-07 16:29
 */
public class SalariedEmployee extends Employee {
    private double mongthySalary;

    public SalariedEmployee(String name, int number, MyDate birthday,double mongthySalary ) {
        super(name, number, birthday);
        this.mongthySalary = mongthySalary;
    }

    @Override
   public  double earnings() {
        return mongthySalary;
    }

    public double getMongthySalary() {
        return mongthySalary;
    }

    public void setMongthySalary(double mongthySalary) {
        this.mongthySalary = mongthySalary;
    }
    public void addEaring(){
        mongthySalary += 100;
    }
    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "mongthySalary=" + mongthySalary +
                ",name = " + getName() + ",number = " + getNumber() +
                 ",birthday = " + getBirthday().toDateString()+
                '}';
    }
}
