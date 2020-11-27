/**
 * @author yycstart
 * @create 2020-07-24 20:25
 *
 * 给定一个年份，判断是否是闰年
 * 闰年的判断标准是：
 * 1）可以被4整除，但不可被100整除
 * 2）可以被400整除
 */
import java.util.Scanner;
public class Test17_IfRunNian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 !=0) || year %400 ==0){
            System.out.println("这一年为闰年");
        }else{
            System.out.println("这一年不是闰年");
        }
    }
}
