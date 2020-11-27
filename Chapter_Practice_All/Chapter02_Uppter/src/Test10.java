/**
 * @author yycstart
 * @create 2020-07-24 15:16
 *
 * 1. 定义类 Test10
 * 2. 定义 main方法
 * 3. 定义 int类型变量i1 和 long类型变量l1
 * 4. 定义变量add,保存i1和l1的和,并输出. 5. 定义 long类型变量l2 和 float类型变量f2
 * 6. 定义变量add2,保存l2和f2的和,并输出. 7. 定义 int类型变量i3 和 double类型变量d3
 * 8. 定义变量add3,保存i3和d3的和,并输出. 9. 定义 float类型变量f4 和 double类型变量d4
 * 10. 定义变量add4,保存f4和d4的和,并输出.
 */
public class Test10 {
    public static void main(String[] args) {

        int i1 = 100;
        long l1 = 200;
        long add = i1 + l1;
        System.out.println("add的值：" + add);
        long l2 = 1000000L;
        float f2 = 0.44F;
        float add2 = l2 + f2;
        System.out.println("add2的值：" + add2);
        int i3 = 100000;
        double d3 = 0.45;
        double add3 = i3 + d3;
        System.out.println("add3的值：" + add3);
        float f4 = 1000000;
        double d4 = 1.2625;
        double add4 = f4 + d4;
        System.out.println("add4的值：" + add4);
    }
}
