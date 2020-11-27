package com.nswdwy_yu.ppt49;

/**
 * @author yycstart
 * @create 2020-08-07 17:46
 */
public class HourlyEmployee extends Employee{
    private double vage;
    private int  hour;

    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }


    public double earnings(){
        return vage * hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "name=" + getName() +
                ", bunmber = " + getNumber() +
                ",birthday = " + getBirthday().toDateString() +
                '}';
    }
}
