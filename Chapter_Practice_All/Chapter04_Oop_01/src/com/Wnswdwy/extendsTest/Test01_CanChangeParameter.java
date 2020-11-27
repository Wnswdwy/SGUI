package com.Wnswdwy.extendsTest;

import javax.sound.midi.Soundbank;

/**
 * @author yycstart
 * @create 2020-07-30 10:01
 *
 * 在Count类中，声明如下方法：
 * 1、public long sum(int... nums)：求0~n个整数的累加和，如果没有传参，
 * 就返回0
 * 2、public int max(int a, int... others)：求1~n个整数中的最大值
 * 3、public String concat(String... strings)：求0~n个字符串的拼接结果
 * 4、public boolean isEven(int... nums)：判断0~n个整数是否都是偶数，
 * 如果都是偶数，返回true，否则返回false
 * 声明一个Test01测试类，并在main方法中调用测试
 */
public class Test01_CanChangeParameter {
    public static void main(String[] args) {
        Count count = new Count();
        System.out.println("没有传入参数，返回：" + count.sum());
        System.out.println("整数的累加和:"+ count.sum(1,2,3,4,5));
        System.out.println("这些数中最大值为"+ count.max(1,3,4,6,7,5,4,3,2,5,10,3));
        System.out.println("字符串拼接结果为：" + count.concat("你好","中国"));
        System.out.println("输入的数都是偶数："+ count.isEven(2,1,3,4,5));
    }
}
class Count{
   //求0~n个整数的累加和，如果没有传参，就返回0
    public long sum(){
        return 0;
    }
    public long sum(int... nums ){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
    //求1~n个整数中的最大值
    public int max(int a, int... others){
        int maxNumber = others[0];
        for (int i = 1; i < others.length; i++) {
            if(others[0] < others[i]){
                others[0] = others[i];
            }
        }
        return others[0];
    }
    //求0~n个字符串的拼接结果
    public String concat(String... strings){
        String nums = " ";
        for (int i = 0; i < strings.length; i++) {
            nums  += strings[i];
        }
        return nums;
    }
    //判断0~n个整数是否都是偶数，
    public boolean isEven(int... nums){
        boolean isFlag = true;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 != 0){
                isFlag = false;
                break;
            }
        }
        return isFlag;

    }
}
