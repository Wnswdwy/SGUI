import java.util.Arrays;

/**
 * @author yycstart
 * @create 2020-07-28 18:14
 *
 * 翻转数组[-98, -76, -3, 0, 5, 6, 22, 34]
 */
public class Test02_ExchangeArrays {
    public static void main(String[] args) {
        int[] arr = new int[]{-98, -76, -3, 0, 5, 6, 22, 34 } ;
        int[] arrs = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrs[i] = arr[arr.length -1 -i];
        }
        System.out.print("反转后的数组为：" + Arrays.toString(arrs) + " ");
    }
}
