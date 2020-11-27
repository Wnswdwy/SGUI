package com.wnswdwy_yu.javaextends;

/**
 * @author yycstart
 * @create 2020-08-09 16:06
 */
public class Test06 {
    static int x, y, z;

    static {
        int x = 5;
        x--;
    }
    static {
        x--;
    }
    public static void main(String[] args) {
        System.out.println("x=" + x);
        z--;
        method();
//        int  a = 2;
//        int b =a++  + a++ * ++a;
//        a += a -= ++a * a;
//        System.out.println("a=" + a + ",b = " + b );
//        System.out.println("a = " + a);
        System.out.println("result:" + (z + y + ++z));

    }
    public static void method() {
        y = z++ + ++z;
        System.out.println(y);
    }
}