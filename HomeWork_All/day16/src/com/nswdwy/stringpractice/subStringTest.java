package com.nswdwy.stringpractice;

import java.lang.reflect.GenericArrayType;

/**
 * @author yycstart
 * @create 2020-08-13 14:43
 *
 * 4.获取两个字符串中最长相同子串。比如：
 *     str1 = "abcwerthelloyuiodef ";str2 = "cvhellobnm"
 *     提示：将短的那个串进行长度依次递减的子串与较长的串比较。
 */
public class subStringTest {
    public static void main(String[] args) {
        String str1 = "abcwerthelloyuiodef ";
        String str2 ="cvhelloyyuiodebnm";

        String min = (str1.length() < str2.length()?str1:str2);
        String max = (str1.length() > str2.length()?str1:str2);
        int ruler = min.length();
        loop:
        while(ruler > 0) {
            boolean istrue = false;
            int begin = 0;
            while (begin + ruler <= min.length()) {
                String sub = min.substring(begin, begin + ruler);
                if (max.indexOf(sub) != -1) {
                    System.out.println(sub);
                    istrue = true;
                }
                begin++;
            }
            if(istrue){
                break;
            }
            ruler--;
        }

    }
}
