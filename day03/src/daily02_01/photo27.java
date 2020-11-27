package daily02_01;

/**
 * @author yycstart
 * @create 2020-07-23 14:41
 */
public class photo27 {
    public static void main(String[] args) {
//        String str1 = 4;        //判断对错：
        String str2 = 3.5f + "";             //判断str2对错：
        System.out.println(str2);            //输出：
        System.out .println(3+4+"Hello!");   //输出：
        System.out.println("Hello!"+3+4);    //输出：System.out.println(‘a’+1+“Hello!”);    //输出：
        System.out.println("Hello"+'a'+1);   //输出：
        System.out.println('a'+1+"Hello");   //输出：
        String a = "43";
        int i = Integer.parseInt(a);
        System.out.println(i);
        byte b = 3;
        byte c = 4;
//        b = b + 4;                  //判断：no
//        b = (byte)(b+4);        //判断：yes
        byte m ;
        m= (byte)(b + c);
        System.out.println(m);
        byte p = 5;
        short s = 3;
        byte t = (byte)(s + p);
        System.out.println(t);

    }
}
