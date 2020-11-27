package daily02_01;

/**
 * @author yycstart
 * @create 2020-07-23 16:29
 */
public class photo67 {
    public static void main(String[] args) {


    int a = 10;
    int b = 20;
    int c= a++;
    System.out.print("c="+c);
    System.out.println("  a="+a);
    c = ++a;
    System.out.print("c="+c);
    System.out.println("  a="+a);
    c = b--;
    System.out.print("c="+c);
    System.out.println("  b="+b);
    c = --b;
    System.out.print("c="+c);
    System.out.println("  b="+b);

    }
}
