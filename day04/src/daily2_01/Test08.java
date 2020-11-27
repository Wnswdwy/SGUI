package daily2_01;

/**
 * @author yycstart
 * @create 2020-07-24 14:45
 *
 * 定义类 Test8
 * 2. 定义 main方法
 * 3. 定义byte类型变量，并赋值为10，不换行输出类型说明，换行输出变量值。
 * 4. 定义short类型变量，并赋值为100，不换行输出类型说明，换行输出变量值。
 * 5. 定义int类型变量，并赋值为1000，不换行输出类型说明，换行输出变量值。
 * 6. 定义long类型变量，并赋值为10000，不换行输出类型说明，换行输出变量值。
 * 7. 定义float类型变量，并赋值为100000.0，不换行输出类型说明，换行输出变量值。
 * 8. 定义double类型变量，并赋值为1000000.0，不换行输出类型说明，换行输出变量值。
 * 9. 定义char类型变量，并赋值为'Z'，不换行输出类型说明，换行输出变量值。
 * 10. 定义boolean类型变量，并赋值为false，不换行输出类型说明，换行输出变量值。
 */
public class Test08 {
    public static void main(String[] args) {
        byte b = 10;
        System.out.print("整数类型-byte：");
        System.out.println(b);
        short s = 100;
        System.out.print("整数类型-short：");
        System.out.println(s);
        int i = 1000;
        System.out.print("整数类型-int：");
        System.out.println(i);
        long l = 10000L;
        System.out.print("整数类型-long：");
        System.out.println(l); float f = 100000.0F;
        System.out.print("小数类型-float：");

        System.out.println(f);
        double d = 1000000.0;
        System.out.print("小数类型-double：");
        System.out.println(d);
        char c = 'Z';
        System.out.print("字符类型-char：");
        System.out.println(c);
        boolean no = false;
        System.out.print("布尔类型-boolean：");
        System.out.println(no);
    }
}
