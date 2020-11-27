import java.util.Arrays;

/**
 * @author yycstart
 * @create 2020-07-27 18:19
 *
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
 * 然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
 * 要求：所有随机数都是两位数。
 *
 * 提示：如何获取指定范围的随机数
 *  (int)(Math.random() * 90 + 10)
 */
public class Test2_GetArraysSumMaxMin {
    public static void main(String[] args) {
        int[] Array1 = new int[10];
        int Sum = 0;
        for (int i = 0; i < 10; i++) {
            Array1[i] = (int)(Math.random() * 90 + 10);
            Sum += Array1[i];
        }
        Arrays.sort(Array1);
        System.out.print("排序后的元素为：");
        for (int i = 0; i < 10; i++) {
            System.out.print(Array1[i] + "\t");
        }
        System.out.println();
        System.out.println("最小值为：" + Array1[0]);
        System.out.println("最大值为：" + Array1[9]);
        System.out.println("所有元素的和为：" + Sum);
        System.out.println("所有元素的平均值为：" + Sum / 10.0);
    }
}
