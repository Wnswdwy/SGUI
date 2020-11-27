/**
 * @author yycstart
 * @create 2020-07-25 19:12
 *
 * 我家的狗5岁了，5岁的狗相当于人类多大呢？
 * 其实，狗的前两年每一年相当于人类的10.5岁，之后每增加一年就增加四岁。
 * 那么5岁的狗相当于人类多少年龄呢？应该是：10.5 + 10.5 + 4 + 4 + 4 = 33岁。
 * 编写一个程序，获取用户输入的狗的年龄，通过程序显示其相当于人类的年龄。
 * 如果用户输入负数，请显示一个提示信息。
 */
import java.util.Scanner;
public class Test01_DogAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入狗的年龄：");
        double Age = sc.nextDouble();
        double AboutManAge = 0.0;
        if(Age < 0){
            System.out.println("请输入狗狗正确的年龄！！");
        }
        while(Age > 0){
            if(Age >= 2){
                AboutManAge = 2 * 10.5;
                Age -=2;
            }
            AboutManAge += (Age*4);
            System.out.println();
            Age = 0;
            System.out.println("狗的年龄相当于："+ AboutManAge);
        }

    }
}
