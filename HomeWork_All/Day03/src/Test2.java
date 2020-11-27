/**
 * @author yycstart
 * @create 2020-07-24 18:06
 *
 * 2. 编写程序，声明2个double型变量并赋值。
 * 判断第一个数大于10.0，
 * 且第2个数小于20.0，打印两数之和。
 * 否则，打印两数的乘积。
 */
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
       double a = sc.nextDouble();
        System.out.println("请输入第二个数：");
       double b = sc.nextDouble();
       double c = 0;
       if(a > 10.0 && b < 20.0){
            c = a + b;
           System.out.println("两个数的和为："+ c);
       }else{
            c = a * b;
           System.out.println("两个数的积为："+c );
       }
    }
}
