/**
 * @author yycstart
 * @create 2020-07-26 11:37
 *
 * 100以内的所有质数
 */
public class Photo49_02_Letter100PrimeNumber {
    public static void main(String[] args) {
        int factor = 0;
        System.out.print("100内质数为：");
        for (int i = 2; i < 100 ; i++) {
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if(i % j == 0 ){
                    factor ++ ;
                }
            }
            if(factor  ==  1){
                System.out.print(i + " ");
            }
            factor = 0;
        }

    }
}
