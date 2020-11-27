package com.nswdwy.test03;

/**
 * @author yycstart
 * @create 2020-08-11 19:21
 * 模拟一个trim方法，去除字符串两端的空格。
 */
public class TrimTest {
    public static void main(String[] args) {
        String string = "  abcQYz12 我喜欢你,你喜欢我吗? 我不喜欢你, zzQQyy  ";
        System.out.println("变化前为：" + string);
        MyTrim myTrim = new MyTrim();
        myTrim.myprint(string);

    }
}
