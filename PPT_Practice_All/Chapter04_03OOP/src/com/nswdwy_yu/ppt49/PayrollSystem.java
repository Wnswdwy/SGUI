package com.nswdwy_yu.ppt49;

/**
 * @author yycstart
 * @create 2020-08-07 21:16
 */
import java.util.Scanner;

public class PayrollSystem {//
    public static void main(String[] args) {
        Employee [] employees = new Employee[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入本月月份：");
        int intMonth = sc.nextInt();
        Employee employee1 = new SalariedEmployee("Bob",1,new MyDate(1998,10,7),1000);
        employees[0] =employee1;
        SalariedEmployee ss = (SalariedEmployee)employee1;
        Employee employee2 = new HourlyEmployee("Tom",2,new MyDate(1972,8,9));
        employees[1] = employee2;
        for(int i = 0; i < 2;i++) {
            if (intMonth == employees[i].getBirthday().getMonth()) {
                SalariedEmployee s = (SalariedEmployee)employees[i];
                s.addEaring();
                System.out.println(employees[i].toString() + "涨工资100");

            }else{
                System.out.println(employees[i].toString());
            }

        }
    }
}
