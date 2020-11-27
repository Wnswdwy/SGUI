/**
 * @author yycstart
 * @create 2020-07-27 20:32
 *
 * 模拟在一副牌中，抽取第1张，第5张，第50张扑克牌。
 *
 */
import java.util.Scanner;
public class Test03_SelectAnyonePoker_Is_Which {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要抽第几张牌：");
        int selectNumber = sc.nextInt();
        String[] pokers = new String[13];
        String[] allPokes = new String[72];
        int numbers = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < 13; j++) {
                switch (i) {
                    case 1:
                        pokers[j] = "黑桃";
                        break;
                    case 2:
                        pokers[j] = "红桃";
                        break;
                    case 3:
                        pokers[j] = "梅花";
                        break;
                    case 4:
                        pokers[j] = "方片";
                        break;
                }
                if (j == 1) {
                    pokers[j] += "A ";
                    allPokes[numbers++] = pokers[j];
                    continue;
                } else if (j == 10) {
                    pokers[j] += "J ";
                    allPokes[numbers++] = pokers[j];
                    continue;
                } else if (j == 11) {
                    pokers[j] += "Q ";
                    allPokes[numbers++] = pokers[j];
                    continue;
                } else if (j == 12) {
                    pokers[j] += "K";
                    continue;
                } else {
                    pokers[j] += (j + 1);
                    allPokes[numbers++] = pokers[j];
                    continue;
                }
            }
        }
        System.out.println("你抽出的第" + selectNumber + "张牌是：" + allPokes[selectNumber - 1]);
    }
}
