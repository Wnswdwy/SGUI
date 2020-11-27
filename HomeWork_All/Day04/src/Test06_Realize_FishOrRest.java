/**
 * @author yycstart
 * @create 2020-07-25 21:13
 *
 * 假设从2000年1月1日开始三天打鱼，两天晒网，
 * 从键盘输入今天的日期年、月、日，
 * 显示今天是打鱼还是晒网？
 */
import java.util.Scanner;
public class Test06_Realize_FishOrRest {
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入今天的年份：");
            int year = sc.nextInt();
            System.out.println("请输入今天的月份：");
            int month = sc.nextInt();
            System.out.println("请输入今天的日期：");
            int day = sc.nextInt();
            int AllNumberDay = 0;
            System.out.println("今天是 " + year + "年" + month+ "月"+ day + "日");
            while(year > 2000){
                if((year % 4 == 0 && year % 100  != 0) || year % 400 == 0) {
                    AllNumberDay += 366;
                }else {
                    AllNumberDay += 365;
                }
                year -- ;
            }
            switch (month - 1) {
                case 12:
                    AllNumberDay += 31;
                case 11:
                    AllNumberDay += 30;
                case 10:
                    AllNumberDay += 31;
                case 9:
                    AllNumberDay += 30;
                case 8:
                    AllNumberDay += 31;
                case 7:
                    AllNumberDay += 31;
                case 6:
                    AllNumberDay += 30;
                case 5:
                    AllNumberDay += 31;
                case 4:
                    AllNumberDay += 30;
                case 3:
                    AllNumberDay += 31;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        AllNumberDay += 29;
                    } else {
                        AllNumberDay += 28;
                    }
                case 1:
                    AllNumberDay += 31;
                default:
            }
            AllNumberDay += day;
            System.out.println("一共："+ AllNumberDay);

            switch (AllNumberDay % 5){
                case 1:
                case 2:
                case 3:
                    System.out.println("今天打鱼！");
                    break;
                case 4:
                case 0:
                    System.out.println("今天晒网！");
                    break;
            }
            System.out.println();
        }
    }
}
