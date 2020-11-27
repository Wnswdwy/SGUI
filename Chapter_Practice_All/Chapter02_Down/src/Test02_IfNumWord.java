/**
 * @author yycstart
 * @create 2020-07-24 20:52
 */
import java.util.Scanner;
public class Test02_IfNumWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char num = sc.next().charAt(0);
        if(num <= '9' || num >= '0'){
            System.out.println("输入的是数字");
        }else if(num >= 'a'&& num <= 'z'|| num >= 'A'&& num <= 'Z'){
            System.out.println("输入的是字母");
        }else{
            System.out.println("输入的是其他类型的数");
        }
    }
}
