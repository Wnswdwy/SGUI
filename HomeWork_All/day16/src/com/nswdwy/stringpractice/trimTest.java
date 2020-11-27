package com.nswdwy.stringpractice;

import java.lang.reflect.GenericArrayType;

/**
 * @author yycstart
 * @create 2020-08-13 15:10
 *  //模拟一个trim方法，去除字符串两端的空格。
 */
public class trimTest {
    public static void main(String[] args) {
        String string = "    aav dsv d  sdssdvsvss \t \n  \r";
        System.out.println("去除首尾空字符后为：" + string);
        int begin = 0;
        int end = string.length() - 1;
        boolean istrue1 = true;
        boolean istrue2 = true;
        while(istrue1 || istrue2){
            if(string.charAt(begin) <= 32){
                begin ++;
                continue;
            }else{
                istrue1 = false;
            }
            if(string.charAt(end) <= 32){
                end--;
            }else{
                istrue2 = false;
            }
        }
        String sub = string.substring(begin,end);
        System.out.println("去除首尾空字符后为：" + sub);
    }
}
