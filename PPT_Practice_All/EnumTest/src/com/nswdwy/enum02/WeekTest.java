package com.nswdwy.enum02;

/**
 * @author yycstart
 * @create 2020-08-10 18:30
 *
 * 创建星期枚举类，有7个枚举值，包含计划属性plan，为此属性赋值（使用构造器）。
 */
public class WeekTest {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        Week[] weeks = Week.values();
        Week value = weeks[a - 1];
        System.out.println(value);
    }
}

enum Week {
    Monday,Tuesday,Wednesday, Thursday, Friday, Saturday, Sunday


}

