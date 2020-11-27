/**
 * @author yycstart
 * @create 2020-07-26 11:06
 *
 *假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，
 * 提示用户输入一个两位数，然后按照下面的规则判定用户是否能赢。
 * 1)如果用户输入的数匹配彩票的实际顺序，奖金100000美元。
 * 2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
 * 3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
 * 4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
 * 5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
 *
 */
import java.util.Scanner;
public class Photo17_GuessLottery {
    public static void main(String[] args) {
        while(true){
            int Number1 = (int) (Math.random() * 90 + 10);
            System.out.println("请输入一个二位数：");
            Scanner sc = new Scanner(System.in);
            int Number2 = sc.nextInt();
            System.out.println();
            System.out.println("随机产生的二位数为：" + Number1);
            System.out.println("您输入的二位数为：" + Number2);
            if(Number1 == Number2){
                System.out.println("恭喜你，获得奖金10000美金！");
            }else if((Number1 % 10 == Number2 / 10) && (Number1 /10 == Number2 % 10) ){
                System.out.println("你获得奖金3000美金!");
            }else if((Number1 / 10 == Number2 / 10) || (Number1 %10 == Number2 % 10)){
                System.out.println("你获得奖金1000美金");
            }else if((Number1 % 10 == Number2 / 10) || (Number1 /10 == Number2 % 10)){
                System.out.println("你获得奖金500美金");
            }else{
                System.out.println("不好意思，您没有中奖，彩票作废!!!");
            }
            System.out.println();
        }
        }
}