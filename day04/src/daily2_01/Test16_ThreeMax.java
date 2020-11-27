package daily2_01;

/**
 * @author yycstart
 * @create 2020-07-24 20:22
 *
 * 求三个整数x,y,z中的最大值
 */
public class Test16_ThreeMax {
    public static void main(String[] args) {
        int a = 3,b = 4, c = 5;
        int max = 0;
//       int  max1 = (a > b ? a:b);
        max = ((a > b ? a:b) > c ? (a > b ? a:b):c);
    }
}
