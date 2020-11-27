package homework2;

/**
 * @author yycstart
 * @create 2020-07-24 18:58
 *
 * 随意给出一个整数，打印显示它的个位数，十位数，百位数的值。
 */
import java.util.Scanner;
public class Test05_GSB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();
        int G = num % 10;
        int S = (int)(num /10.0) % 10;
        int B = num / 100;
        System.out.println("个位数："+ G );
        System.out.println("十位数："+ S );
        System.out.println("百位数："+ B );
    }
}
