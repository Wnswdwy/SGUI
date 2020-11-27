package com.Wnswdwy.extendsTest;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @author yycstart
 * @create 2020-07-30 10:51
 */
public class Test03_Section_TwoMiniteSearch {
    public static void main(String[] args) {
       int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i] = (int)(Math.random() * 10 + 1);
        }
        Arrays.sort(num);
        int value = (int)(Math.random() * 10 + 1);
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                int start = 0;
                int end = num.length - 1;
                int middle = (start + end) / 2;
                boolean isflag = false;
                while (start < end) {
                    if (num[middle] == value) {
                        System.out.println("找到了，下标为" + value);
                        isflag = true;
                    } else if (num[middle] > value) {
                        end = middle;
                    } else if (num[middle] < value) {
                        start = middle;
                    }
                    middle = (start + end) / 2;
                }
                if(isflag == false){
                    System.out.println("不好意思没找到！");
                }
            }

        }

    }
}
