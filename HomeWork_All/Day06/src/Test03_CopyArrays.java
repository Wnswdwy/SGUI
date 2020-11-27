import java.util.Arrays;

/**
 * @author yycstart
 * @create 2020-07-28 18:20
 *
 * 复制一个数组[-98, -76, -3, 0, 5, 6, 22, 34]得到新数组
 */
public class Test03_CopyArrays {
    public static void main(String[] args) {
        int[] arr = new int[]{-98, -76, -3, 0, 5, 6, 22, 34};
        int[] arrs = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrs[i] = arr[i];
        }
        System.out.print("原数组为："+ Arrays.toString(arr)+ " ");
        System.out.println();
        System.out.print("复制后的数组为："+ Arrays.toString(arrs)+ " ");
    }
}
