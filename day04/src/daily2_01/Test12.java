package daily2_01;

/**
 * @author yycstart
 * @create 2020-07-24 19:36
 *
 * 1.定义类 Test12
 * 2. 定义 main方法
 * 3. 定义两个int类型变量a1和a2,分别赋值10,11,判断变量是否为偶数,拼接输出结果
 * 4. 定义两个int类型变量a3和a4,分别赋值12,13,判断变量是否为奇数,拼接输出结果
 */
public class Test12 {
    public static void main(String[] args) {
        int a1 = 10;
        int a2 = 11;
        int a3 = 12;
        int a4 = 13;
        System.out.println("10是偶数？" + (a1 % 2 == 0));
        System.out.println("11是偶数？" + (a2 % 2 == 0));
        System.out.println("12是奇数？" + (a3 % 2 != 0));
        System.out.println("13是奇数？" + (a4 % 2 != 0));
    }
}
