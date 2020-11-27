/**
 * @author yycstart
 * @create 2020-07-30 14:46
 *
 * f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
 * 其中n是大于0的整数，求f(10)的值。
 */
public class Photo95_03_ResultNumber {
    public static void main(String[] args) {
        Test03 te = new Test03();
        System.out.println(te.numResult(10));

    }
}
class Test03{
    public int numResult(int n){
        if(n == 20){
            return 1;
        }else if(n == 21){
            return 4;
        }else {
            return n + 2 - 2 * (n +1);
        }
    }
}