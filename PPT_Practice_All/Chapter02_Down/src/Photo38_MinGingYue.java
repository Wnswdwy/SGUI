/**
 * @author yycstart
 * @create 2020-07-25 15:01
 * 输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 比如：12和20的最大公约数是4，最小公倍数是60。
 */
import java.util.Scanner;
public class Photo38_MinGingYue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第1个数：");
        int number1 = sc.nextInt();
        System.out.println("请输入第2个数：");
        int number2 = sc.nextInt();
        int MaxYueShu = 1;
        int MinMultiple = 1;
        int min = (number1 >= number2 ? number2:number1);
        for(int i = min; i >= 0 ;i --){
            if(number1 % i == 0 && number2 % i ==0){
                System.out.println("最大公约数为：" + i);
                MaxYueShu = i;
                break;
            }
        }
        MinMultiple = number1 * number2 / MaxYueShu;
        System.out.println("最小公倍数为："+ MinMultiple);
    }
}
