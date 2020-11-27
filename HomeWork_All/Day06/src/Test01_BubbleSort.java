import java.util.Arrays;

/**
 * @author yycstart
 * @create 2020-07-28 18:01
 *
 * 使用冒泡排序，实现如下的数组从小到大排序。
 *  int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
 *
 */
public class Test01_BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        System.out.print("从小到大排序后为："+Arrays.toString(arr)+ " ");
    }
}
