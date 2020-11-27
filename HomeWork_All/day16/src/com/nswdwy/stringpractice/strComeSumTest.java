package com.nswdwy.stringpractice;

/**
 * @author yycstart
 * @create 2020-08-13 15:40
 *
 *
3）获取一个字符串在另一个字符串中出现的次数。
比如：获取“ ab”在 “abkkcadkabkebfkabkskab” 中出现的次数
 */
public class strComeSumTest {
    public static void main(String[] args) {
        String str = "abkkcadkabkebfkabkskab";
        String str2 = "ab";
        int begin= 0;
        int longth = str2.length();
        int count = 0;
        while(begin + longth <= str.length()) {
            if ((str.substring(begin, begin + longth)).equals(str2)) {
                count++;
            }
            begin ++;
        }
        System.out.println("str2出现次数为：" + count);
    }
}
