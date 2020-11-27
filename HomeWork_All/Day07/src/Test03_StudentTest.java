/**
 * @author yycstart
 * @create 2020-07-29 18:47
 *
 * 4. 对象数组题目：
 * 定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 * 创建20个学生对象，学号为[1,20]，年级为[1,6]和成绩[0.100]都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * ：Student对象数组问题中涉及到的相关操作，封装进方法，测试执行。
 * 比如：打印年级是3年级的方法；学生数组对象的排序；遍历Student数组中对象的方法
 *//*

public class Test03_StudentTest {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.initiatizeMethod();
    }
}

class Student{
    //包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
    int number,state,score;

    public void initiatizeMethod(){
        //创建20个学生对象，学号为[1,20]，年级为[1,6]和成绩[0.100]都由随机数确定
        Student[] stu = new Student[20];
        String stateIsThree  = " ";
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student();
            stu[i].number = i + 1;
            stu[i].state = (int)(Math.random() * 6 + 1);
            stu[i].score = (int)(Math.random() * 101 );

            info( stu[i],i);
            ////打印出3年级(state值为3）的学生信息。
            if(stu[i].state == 3){
                stateIsThree =  stateIsThree + "\n" + "number" +
                        stu[i].number + "state is " + stu[i].state +
                        ",score is "+ stu[i].score;
                System.out.print(stateIsThree);
            }
        }

    }
    public void info( Student stu[],int a) {
        for (int i = 0; i < a; i++) {
            System.out.println( "number : " + stu[i].number +
                    ", state : " + stu[i].state + ", score : " + stu[i].score);
        }

        }



}*/
