package com.nswdwy.net.test03;

import java.util.Arrays;

/**
 * @author yycstart
 * @create 2020-08-14 20:40
 * 将字符串中的数字按顺序排列后输出排序后组成的数组
 */
public class arraysReverseTest {
        public static void main(String[] args) {
            String abc = "342567891";
            char[] arr = abc.toCharArray();
            Arrays.sort(arr);
            for(Object temp : arr){
                System.out.print(temp+="");
            }

        }
    }
