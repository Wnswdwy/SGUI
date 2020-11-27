package daily02_01;

/**
 * @author yycstart
 * @create 2020-07-23 17:14
 */
public class photo70 {
    public static void main(String[] args) {
        int i = 1;
        i *= 0.1;
        System.out.println(i);//0
        i++;
        System.out.println(i);//1
        int m = 2;
        int n = 3;
        n *= (m++);
        System.out.println("m=" + m);
        System.out.println("n=" + n);

    }

}
