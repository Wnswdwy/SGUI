import java.util.concurrent.ForkJoinPool;

/**
 * @author yycstart
 * @create 2020-07-29 21:04
 *
 * 4. 对象数组题目：
 * 定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 * 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 *
 * 提示：
 * 1) 生成随机数：Math.random()，返回值类型double;
 * 2) 四舍五入取整：Math.round(double d)，返回值类型long。
 */
public class Photo58_Student {
    public static void main(String[] args) {
            Student[] stu = new Student[20];
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student();
            stu[i].number = i + 1;
            stu[i].state = (int)(Math.random() * 6 + 1);
            stu[i].score = (int)(Math.random() * 101);
        }
        //打印学生信息
        System.out.println("打印学生信息如下：");
        for (int i = 0; i < stu.length; i++) {
            stu[i].info();
        }
        System.out.println("--------------------------------------");
        //打印班级为3的学生信息
        System.out.println("打印班级为3的学生信息如下：");
        for (int i = 0; i < stu.length; i++) {
            if(stu[i].state == 3){
                stu[i].info();
            }
        }
        System.out.println("------------------------------------");
        //按score从小到大输出学生信息(冒泡排序)

        for (int i = 0; i < stu.length; i++) {
            for (int j = 0; j < stu.length - 1  ; j++) {
                if(stu[j].score > stu[j+1].score){
                    Student temp = stu[j];
                    stu[j] = stu[j+ 1];
                    stu[j+1] = temp;
                }
            }
        }
        System.out.println("冒泡排序后的学生信息如下：");
        for (int i = 0; i < stu.length; i++) {
            stu[i].info();
        }


    }

}
 class Student{
    // 包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
     int number , state , score;
     public void info(){
         System.out.println("number   " + number + "state is " +
                 state + ",score is  " + score);
     }
}