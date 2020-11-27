package com.nswdwy.test03;

/**
 * @author yycstart
 * @create 2020-08-11 19:24
 */
public class MyTrim {
    public void myprint(String string) {
        int begin = 0;
        int end = string.length() - 1;
        char[] chars = string.toCharArray();
        if (string.startsWith(" ")) {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ' ') {
                    begin++;
                }else{
                    break;
                }
            }
        }
        int num2 = 0;
        if(string.endsWith(" ")){
            int i;
            loop2:
            for (i = chars.length-1; i >= 0; i--) {
                    if (chars[i] != ' '){
                        end--;
                    }else{
                        break ;
                    }
            }
        }
        String s = string.substring(begin, end);
        System.out.println("变化后为：" + s);
    }
}
