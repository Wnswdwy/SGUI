package com.nswdwy.test04;

/**
 * @author yycstart
 * @create 2020-08-11 20:22
 * 4.获取两个字符串中最大相同子串。比如：
 *    str1 = "abcwerthelloyuiodef ";str2 = "cvhellobnm"
 *    提示：将短的那个串进行长度依次递减的子串与较长
 *    的串比较。
 */
public class CompareChars {
    public String compareFinal(String str1,String str2) {

//        String shortString = str1.length() > str2.length() ? str2 : str1;
//        String longString = str1.length() > str2.length() ? str1 : str2;
//        for (int i = 0; i < shortString.length(); i++) {
//            for (int j = 0, k = shortString.length() - i; k < shortString.length(); k++, j++) {
//                String subs = shortString.substring(j, k);
//                if (longString.contains(subs)) {
//                    return subs;
//                }
//            }
//        }
//        return null;

        String maxString = (str1.length() > str2.length() ? str1 : str2);
        String minString = (str1.length() < str2.length() ? str1 : str2);

        for (int i = 0; i < minString.length(); i++) {
            for (int j = minString.length() - 1 - i; j > 0; j--) {
                    String subs = minString.substring(i, j);
                    if (maxString.contains(subs)) {
                        return subs;
                    }
                    else {
                        break;
                    }

            }
        }
        return null;
    }
}

