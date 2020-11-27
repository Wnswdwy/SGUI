package com.nswdwy.test01;

/**
 * @author yycstart
 * @create 2020-08-11 17:49
 */
public class WeekTest {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        Week[] week = Week.values();
        System.out.println(week[a - 1] + "\n" +week[a - 1].feel);
    }
}
