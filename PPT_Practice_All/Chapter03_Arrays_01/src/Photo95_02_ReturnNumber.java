/**
 * @author yycstart
 * @create 2020-07-30 14:33
 *
 * 已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),
 * 其中n是大于0的整数，求f(10)的值。
 */
public class Photo95_02_ReturnNumber {
    public static void main(String[] args) {
    Test02 tes = new Test02();
        System.out.println(tes.numResult(10));

    }
}

class Test02{
    //f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),求f(10)的值
    public int numResult(int n){
        if(n == 0){
            return 1;
        }else if(n == 1){
            return 4;
        }else {
            return 2 * (n -1) - n - 2;
        }
    }
}
