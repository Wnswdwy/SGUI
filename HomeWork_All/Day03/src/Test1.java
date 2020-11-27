/**
 * @author yycstart
 * @create 2020-07-24 17:49
 * 1.定义三个int型变量并赋值，使用三元运算符或者if-else获取这三个数中的较大数的实现
 *
 */
public class Test1 {
    public static void main(String[] args) {
        int a = 4,b = 3, c = 5;
//        int max = (a > b) ? a : b;
        int max1 = (((a > b) ? a : b) > c) ? ((a > b) ? a : b) : c;
        System.out.println("三个数中最大的是："+ max1);

        int max2 = 0;
        if(a > b){
            max2 = a;
            if(c > max2){
                System.out.println("三个数中最大的是："+ c);
            }else{
                System.out.println("三个数中最大的是："+ max2);
            }
        }else{
            max2 = b;
            if(c > max2){
                System.out.println("三个数中最大的是："+ c);
            }else{
                System.out.println("三个数中最大的是："+ max2);
            }
        }
    }
}
