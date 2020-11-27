/**
 * @author yycstart
 * @create 2020-07-27 20:03
 *
 * 输出扑克牌
 */
public class Test02_OutPoker {
    public static void main(String[] args) {
        String[] pokers = new String[14];
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j < 14; j++) {
                switch (i){
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
                if(j  == 1 ){
                    pokers[j] += "A ";
                    System.out.print(pokers[j]);
                    continue;
                }else if(j == 11) {
                    pokers[j] += "J ";
                    System.out.print(pokers[j]);
                    continue;
                }else if(j == 12){
                    pokers[j] += "Q ";
                    System.out.print(pokers[j]);
                    continue;
                }else if(j == 13){
                    pokers[j] += "K";
                    System.out.print(pokers[j]);
                    continue;
                }else{
                    System.out.print(pokers[j] + j + " ");
                    continue;
                }
            }
            System.out.println();
        }
    }
}
