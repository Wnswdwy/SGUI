package com.wnswdwy.exer;

import java.util.Scanner;
    /**
     * @author yycstart
     * @create 2020-08-14 20:25
     * 键盘录入QQ号码，验证格式的正确性。
     * 必须是5—12位数字。
     * 0不能开头
     */
    public class Test03_QQ {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("请输入qq号码：");
            String qq = input.next();
            System.out.print("这个qq号是否正确：");
            if (qq.matches("[1-9][0-9]{4,11}+")) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            input.close();
        }
    }
