/**
 * @author yycstart
 * @create 2020-07-23 10:46
 */
public class trouble2 {
    public static void main(String[] args) {
        int a=0,b=0;
        b+=a*=b+=(a=1)/(b=1);
        System.out.println(b);
        a = 0;
        b = 0;
        b+=++a+(++a+b);
    System.out.println(b);
    }

}
