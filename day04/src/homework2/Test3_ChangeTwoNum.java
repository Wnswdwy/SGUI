package homework2;

/**
 * @author yycstart
 * @create 2020-07-24 18:21
 *
 * 交换两个数
 */
public class Test3_ChangeTwoNum {
    public static void main(String[] args) {
        int m = 3,n = 5;
        int temp = m;
        m = n;
        n = temp;
        System.out.println("m的值为："+m);
        System.out.println("n的值为："+n);
    }
}
