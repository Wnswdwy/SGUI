package HomeWork04;

/**
 * @author yycstart
 * @create 2020-07-25 21:01
 *
 * 编写程序从1循环到150，并在每行打印一个值，另外在每个3的倍数行上打印出“foo”,
 * 在每个5的倍数行上打印“biz”,在每个7的倍数行上打印输出“baz”
 */
public class Test05_DaYing {
    public static void main(String[] args) {
        for (int i = 1; i < 151; i++) {
            System.out.print(i + " ");
            if(i % 3 == 0){
                System.out.print("foo");
            }
            if( i % 5 == 0){
                System.out.print("biz");
            }
            if( i % 7 == 0){
                System.out.print("baz");
            }
            System.out.println();

        }
    }
}
