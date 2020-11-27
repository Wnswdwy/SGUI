/**
 * @author yycstart
 * @create 2020-07-29 18:34
 *
 * 三个重载方法max()，第一个方法求两个int值中的最大值，
 * 第二个方法求两个double值中的最大值，
 * 第三个方法求三个double值中的最大值，并分别调用三个方法。
 */
public class Test02_Print {
    public static void main(String[] args) {
        Test02 test = new Test02();
        test.max(10,20);
        test.max(10.2,11.4);
        test.max(10.2,9.9,8.8);
    }
}
class Test02{
    //求两个int值中的最大值
    public void max(int a,int b){
        int maxNumber = (a > b ? a:b);
        System.out.println("两个int数中最大的是："+maxNumber);
    }
    //第二个方法求两个double值中的最大值
    public void max(double a,double b){
        double maxNumber = (a > b ? a:b);
        System.out.println("两个double数中最大的是：" + maxNumber);
    }
    //第三个方法求两个double值中的最大值
    public void max (double a,double b,double c){
        double maxNumber = (a > b ? a:b) > c ? (a > b ? a:b):c;
        System.out.println("三个double数中最大的是：" + maxNumber);
    }
}