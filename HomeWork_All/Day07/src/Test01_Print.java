/**
 * @author yycstart
 * @create 2020-07-29 18:25
 *
 * 定义三个重载方法并调用。方法名为mOL。
 * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。
 * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
 * 在主类的main ()方法中分别用参数区别调用三个方法。
 */
public class Test01_Print {
    public static void main(String[] args) {
        Test test = new Test();
        int result1 = test.mOL(10);
        int result2 = test.mOL(5,6);
        char result3 = test.mOL('你');
        System.out.println("调用第1个方法输出结果为："+ result1);
        System.out.println("调用第2个方法输出结果为："+ result2);
        System.out.println("调用第3个方法输出结果为："+ result3);
    }
}
class Test{
    public int mOL(int a){
        return a * a;
    }
    public int mOL(int a,int b){
        return a * b;
    }
    public char mOL(char c){
        return c;
    }
}
