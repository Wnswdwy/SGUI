package com.nswdwy.net.test03;

/**
 * @author yycstart
 * @create 2020-08-14 21:09
 */
public class Test05 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operate(a, b);
        System.out.println(a + "," + b);// AB , B
    }
    public static void operate(StringBuffer x, StringBuffer y) {
        x.append(y);// 等价于a拼接b x = AB
        y = x;// 一旦修改形参的地址值，那么就和实参无关了，即让形参重新指向新的对象了
        y.append('x');
        System.out.println("y = " + y);
    }
}

