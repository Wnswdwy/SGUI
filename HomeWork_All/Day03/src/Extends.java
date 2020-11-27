/**
 * @author yycstart
 * @create 2020-07-24 19:11
 *
 * 高：180cm以上；富：财富1千万以上；帅：是。
 * 如果这三个条件同时满足，则：“我一定要嫁给他!!!”
 * 如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
 * 如果三个条件都不满足，则：“不嫁！”
 */
import java.util.Scanner;
public class Extends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入男方身高：");
        int heigh = sc.nextInt();
        System.out.println("请输入男方财产：");
        double  ware = sc.nextDouble();
        System.out.println("帅否:   (true/false)：");
        boolean face = sc.nextBoolean();
        if((heigh > 180) && ( ware > 10000000) && face == true){
            System.out.println("我一定要嫁给他!!!");
        }else if (heigh < 180 &&  ware <10000000 && face == false ) {
            System.out.println("不嫁");
        }else{
                System.out.println("嫁吧，比上不足，比下有余");
        }
    }
}
