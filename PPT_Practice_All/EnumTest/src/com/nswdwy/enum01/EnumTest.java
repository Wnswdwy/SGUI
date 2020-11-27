/*
package com.nswdwy.enum01;

*/
/**
 * @author yycstart
 * @create 2020-08-10 16:42
 * 声明Week枚举类，其中包含星期一至星期日的定义；
 * 在main方法中从命令行接收一个1-7的整数(使用Integer.parseInt方法转换)，
 * 分别代表星期一至星期日，打印该值对应的枚举值，
 *
 * /*在TestWeek类中声明方法void printWeek(Week week)，根据参数值打印相应的中文星期字符串。
 * 然后以第2步中的枚举值调用printWeek方法，输出中文星期。
 *//*

public class EnumTest {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if(a < 1 || a > 7){
            System.out.println("非法/。。。");
            return;
        }
//        Week v = Week.valueOf("MONDAY");
        Week[] valuse = Week.values();
//        System.out.println(v);
        System.out.println(valuse[a- 1]);
    }
}

enum Week{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}*/
