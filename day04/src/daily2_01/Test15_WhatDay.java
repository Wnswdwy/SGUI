package daily2_01;

/**
 * @author yycstart
 * @create 2020-07-24 20:13
 * ：今天是周2，100天以后是周几？
 *
 */
public class Test15_WhatDay {
    public static void main(String[] args) {
        int day =100;
        int week = 0;
        day +=2;
        week = day % 7;
        System.out.println("今天是周2，100天后是周"+ (week==0? "日":week));
    }
}
