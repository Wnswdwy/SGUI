package daily2_01;

/**
 * @author yycstart
 * @create 2020-07-24 14:49
 *
 * 1. 定义类 Test9
 * 2. 定义 main方法
 * 3. 定义两个byte类型变量b1,b2,并分别赋值为10和20.
 * 4. 定义变量b3,保存b1和b2的和,并输出.
 * 5. 定义两个short类型变量s1,s2,并分别赋值为1000和2000.
 * 6. 定义short类型变量s3,保存s1和s2的和,并输出.
 * 7. 定义一个char类型变量ch1赋值为'a',一个int类型变量i1赋值为30.
 * 8. 定义变量ch3,保存c1和i1的差,并输出.
 */
public class Test09 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte)(b1 + b2);
        System.out.println("b1,b2的和为："+ b3);
        short s1 = 1000,s2 = 2000;
        short s3 = (short)(s1+s2);
        System.out.println("s1,s2的和为："+ s3);
        char ch1 = 'a';
        int i1 = 30;
        int ch3 = i1-ch1 ;
        System.out.println("差为："+ ch3);
    }
}
