package com.nswdwy_yu.test03;


import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author yycstart
 * @create 2020-08-05 18:06
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector v = new Vector();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        int grade ;
        int count = 0;
        for (;;){
            grade = sc.nextInt();
            if(grade >=0){
                v.addElement(grade);
                count++;
            }else{
                break;
            }
        }
           Collections.sort(v);
        int maxNumber =(int)v.elementAt(count - 1);
        System.out.println("maxNumber = " + maxNumber);
        System.out.println("向量的长度为：" + v.size());
        int xNumber ;
        for (int i = 0; i < v.size(); i++) {
            xNumber = (int)v.elementAt(i);
            int number = (maxNumber-xNumber) / 10;
            switch (number){
                case 0:
                    System.out.println(xNumber + "等级为： A");
                    break;
                case 1:
                    System.out.println(xNumber + "等级为： B");
                    break;
                case 2:
                    System.out.println(xNumber + "等级为： C");
                    break;
                default:
                    System.out.println(xNumber + "等级为： D");
                    break;
            }
        }
    }
}
