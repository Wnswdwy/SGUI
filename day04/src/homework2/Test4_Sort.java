package homework2;

/**
 * @author yycstart
 * @create 2020-07-24 18:24
 *
 * 由键盘输入三个整数分别存入变量num1、num2、num3，
 * 对它们进行排序(使用 if-else if-else),
 * 并且从小到大输出
 */
import java.util.Scanner;
public class Test4_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第1个数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第2个数：");
        int num2 = sc.nextInt();
        System.out.println("请输入第3个数：");
        int num3 = sc.nextInt();
        int min1,min2,min3;
        if(num1 < num2){
            if(num3 < num1){
                min3 = num3;
                min2 = num1;
                min1 = num2;
                System.out.println("从小到大排序后为："+ min3+" "+ min2+ " "+ min1);
            }else{
                if(num2 > num3){
                    min3 = num1;
                    min2 = num3;
                    min1 = num2;
                    System.out.println("从小到大排序后为："+ min3+" "+ min2+ " "+ min1);
                }else{
                        min3 = num1;
                        min2 = num2;
                        min1 = num3;
                        System.out.println("从小到大排序后为："+ min3+" "+ min2+ " "+ min1);
                }
            }
        }else{  //num1 > num2
            if(num3 > num1){
                min3 = num2;
                min2 = num1;
                min1 = num3;
                System.out.println("从小到大排序后为："+ min3 + " "+ min2 + " " + min1);
            }else{ //num3 < num1
                if(num2 > num3){
                    min3 = num3;
                    min2 = num2;
                    min1 = num1;
                    System.out.println("从小到大排序后为："+ min3+" "+ min2+ " "+ min1);
                }else{ //num3 > num2
                    min3 = num2;
                    min2 = num3;
                    min1 = num1;
                    System.out.println("从小到大排序后为："+ min3+" "+ min2+ " "+ min1);
                }
            }
        }
    }
}
