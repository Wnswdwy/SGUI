import java.util.Scanner;

/**
 * @author yycstart
 * @create 2020-07-30 13:52
 *
 * 请用Java写出递归求阶乘(n!)的算法
 */
public class photo95_01_ReturnJieCheng {
    public static void main(String[] args) {
        int n = (int)(Math.random()*10 + 1);
        System.out.println("----------"+ n);
        Test te = new Test();
        int sumNumbers = te.jieCheng(n);
        System.out.println(sumNumbers);

    }
}
class Test{
    int sum = 1;
    public int jieCheng(int n){
        if(n == 1){
            return 1;
        }else {
            return n * jieCheng(n - 1);
        }
    }

}