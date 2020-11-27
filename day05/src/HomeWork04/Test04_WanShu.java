package HomeWork04;

/**
 * @author yycstart
 * @create 2020-07-25 20:06
 *
 * 一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3。
 * 编程 找出1000以内的所有完数。（因子：除去这个数本身的其它约数）
 */
public class Test04_WanShu {
    public static void main(String[] args) {
        System.out.print("1000内的完数为： ");
        for (int i = 1; i < 1000; i++) {
            int Sum = 0;
            for (int j = 1; j < i; j++) {
                if(i % j == 0){
                    Sum = Sum + j;
                    if(Sum  == i){
                        System.out.print(i + " ");
                    }
                }
            }
        }
    }
}
