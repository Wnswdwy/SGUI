package com.nswdwy.net.test03;

/**
 * @author yycstart
 * @create 2020-08-14 20:45
 * 串String str = "1.hello2.world3.java4.string";要求拆分出每一个单词，并遍历显示
 */
public class spitTest {
    public static void main(String[] args) {
        String str = "1.hello2.world3.java4.string";
        String[] ass = str.split("\\.");
        System.out.println(ass.length);
        System.out.println("------------");
        for (int i = 0; i < ass.length; i++) {
            System.out.println(ass[i]);
        }
    }
}
