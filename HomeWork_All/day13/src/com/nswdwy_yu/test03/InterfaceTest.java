package com.nswdwy_yu.test03;


/**
 * @author yycstart
 * @create 2020-08-07 23:34
 */
public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(3.2);
        ComparableCircle c2 = new ComparableCircle(3.2);
        if(c1.compareTo(c2) == 0) {
            System.out.println("两个圆半径相等：");
        }else if(c1.compareTo(c2) > 0){
            System.out.println("前一个圆半径大");
        }else{
            System.out.println("后一个圆半径大");
        }
    }
}
