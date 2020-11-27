package com.nswdwy.test01;

import java.util.Random;

/**
 * @author yycstart
 * @create 2020-08-12 18:09
 *
 * String str = null;
 * StringBuffer sb = new StringBuffer();
 * sb.append(str);
 *
 * System.out.println(sb.length());//
 *
 * System.out.println(sb);//
 *
 * StringBuffer sb1 = new StringBuffer(str);
 * System.out.println(sb1);//
 */
public class Test01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
//        Random random = new Random();
//        int a = random.nextInt(100);
//        System.out.println(a);
        System.out.println(sb.length());//  4

        System.out.println(sb);//  null

        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);//
    }
}
