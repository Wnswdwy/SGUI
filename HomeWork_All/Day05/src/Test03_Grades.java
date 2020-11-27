/**
 * @author yycstart
 * @create 2020-07-27 18:48
 *
 * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 * 	成绩>=最高分-10    等级为’A’
 * 	成绩>=最高分-20    等级为’B’
 * 	成绩>=最高分-30    等级为’C’
 * 	其余                        等级为’D’
 * 提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
 * 举例：
 */
import java.util.Arrays;
import java.util.Scanner;
public class Test03_Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生人数：\t");
        int numbers = sc.nextInt();
        System.out.println("请输入学生的分数：\t");
        int[] grades = new int[numbers];
        int[] grades1 = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            grades1[i] = sc.nextInt();
            grades[i] = grades1[i];
        }
        Arrays.sort(grades1);
        System.out.println();
        System.out.println("最高分为：" + grades1[numbers-1]);
        for (int i = 0; i < numbers; i++) {
            if (grades[i] >= (grades1[numbers - 1] - 10)) {
                System.out.println("student" + (i + 1) + " score is " + grades[i] + " grade is A");
                continue;
            }
            if (grades[i] >= (grades1[numbers - 1] - 20)) {
                System.out.println("student" + (i + 1) + " score is " + grades[i] + " grade is B");
                continue;
            }
            if (grades[i] >= (grades1[numbers - 1] - 30)) {
                System.out.println("student" + (i + 1) + " score is " + grades[i] + " grade is C");
                continue;
            } else {
                System.out.println("student" + (i + 1) + " score is " + grades[i] + " grade is D");
                continue;
            }
        }
    }
}
