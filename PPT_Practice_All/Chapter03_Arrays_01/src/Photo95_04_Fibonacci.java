import sun.nio.ch.DirectBuffer;

import javax.sound.midi.Soundbank;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yycstart
 * @create 2020-07-30 14:58
 *
 * 输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
 *  1  1  2  3  5  8  13  21  34  55
 *   规律：一个数等于前两个数之和
 *   要求：计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来
 */
public class Photo95_04_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你想获得第几个值：");
        int n = sc.nextInt();
        System.out.println();
        Test04 tes  = new Test04();
        int[] num = new int[n];
        int m = n;
        System.out.println("第"+ n + "个斐波那契数列(Fibonacci)为："
                + tes.dibonacci(n));
        for (int i = 0; i < n; i++) {
            num[i] = tes.dibonacci(m);
            m--;
        }
        int[] newNum = new int[n];
        for (int i = 0; i < n; i++) {
            newNum[i] = num[n - i - 1];
        }
        System.out.println("前"+ n + "个斐波那契数列(Fibonacci)为："+
                Arrays.toString(newNum));
    }
}

class Test04{
    public int dibonacci(int n){
      // 1  1  2  3  5  8  13  21  34  55
      //  规律：一个数等于前两个数之和
        if ( n == 1){
            return 1;
        }else if(n == 2){
            return 1;
        }else{
          return  dibonacci(n - 1) + dibonacci(n-2);
        }
    }
}