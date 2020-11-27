package com.nswdwy.enum01;

/**
 * @author yycstart
 * @create 2020-08-10 17:18
 * /*在TestWeek类中声明方法void printWeek(Week week)，根据参数值打印相应的中文星期字符串。
 *  * 然后以第2步中的枚举值调用printWeek方法，输出中文星期。
 */
public class WeekTest {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        Week[] weeks = Week.values();
        TestWeek testWeek = new TestWeek();
        testWeek.printWeek(weeks[a - 1]);


    }
}
 enum Week{
     MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY

}
class TestWeek{
    public void printWeek(Week week ) {

        switch (week) {
            case MONDAY:
                System.out.println("星期一");
                break;
            case TUESDAY:
                System.out.println("星期二");
                break;
            case WEDNESDAY:
                System.out.println("星期三");
                break;
            case THURSDAY:
                System.out.println("星期四");
                break;
            case FRIDAY:
                System.out.println("星期五");
                break;
            case SATURDAY:
                System.out.println("星期六");
                break;
            case SUNDAY:
                System.out.println("星期日");
                break;
        }
    }
}