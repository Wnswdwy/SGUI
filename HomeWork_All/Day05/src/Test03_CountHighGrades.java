import java.util.Arrays;
import java.util.zip.CheckedOutputStream;

/**
 * @author yycstart
 * @create 2020-07-27 18:36
 *
 * 统计高于平均分的分数有多少个。
 *   - 定义数组[95, 92, 75, 56, 98, 71, 80, 58, 91, 91]。
 */
public class Test03_CountHighGrades {
    public static void main(String[] args) {
        int Sum = 0;
        int count = 0;
        int[] grades = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        Arrays.sort(grades);
        for (int i = 0; i < 10; i++) {
            Sum += grades[i];
        }
        for (int i = 0; i < 10; i++) {
            if(grades[i] > (Sum / 10.0)){
                count ++;
            }
        }
        System.out.println("高于平均分 "+ (Sum / 10.0) + " 有 " + count + " 个！");
    }
}
