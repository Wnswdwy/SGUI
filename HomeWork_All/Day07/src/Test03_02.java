/**
 * @author yycstart
 * @create 2020-07-29 20:01
 */
public class Test03_02 {
    public static void main(String[] args) {
        //定义一个Student类型的数组
        Student student = new Student();
        Student[] stu = new Student[20];

        //调用方法给Student赋值
        student.initialize(stu);
        //调用方法遍历排序前的数组
        student.printInformation(stu);
        System.out.println("==========================================");
        //对数组进行冒泡排序
        student.bubbleSort(stu);
        //调用方法遍历排序后的数组
        student.printInformation(stu);
        System.out.println("==========================================");
        //打印出3年级(state值为3）的学生信息
        student.selectState(stu);
    }

public static class Student {
    int number;
    int score;
    int state;
    public void information() {
        System.out.println("number : " + number +
                ", state : " + state + ", score : " + score);
    }
    public  void selectState(Student[] stu){
        for (int i = 0; i < stu.length; i++) {
            //判断state值为3并编历数组
            if (stu[i].state == 3) {
                stu[i].information();
            }
        }
    }
    //给Student赋值
    public   void initialize(Student[] stu){
        for (int i = 0; i < stu.length; i++) {
            //给每个学生添加学号
            stu[i] = new Student();
            stu[i].number = i + 1;
            //给每个学生添加成绩
            stu[i].score = (int) (Math.random() * 101);
            //给每个学生添加班级
            stu[i].state = (int) (Math.random() * 5 + 1);
        }
    }
    //定义方法遍历数组
    public  void printInformation(Student[] stu) {
        for (int i = 0; i < stu.length; i++) {
            Student s = stu[i];
            s.information();
        }
    }
    //定义冒泡排序方法
    public  void bubbleSort(Student[] stu) {
        for (int i = 0; i < stu.length - 1; i++) {
            for (int j = 0; j < stu.length - 1 - i; j++) {
                if (stu[j].score > stu[j + 1].score) {
                    Student temp = stu[j];
                    stu[j] = stu[j + 1];
                    stu[j + 1] = temp;
                }
            }
        }
    }
}

}
