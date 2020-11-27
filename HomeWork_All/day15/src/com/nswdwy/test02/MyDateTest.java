package com.nswdwy.test02;

import java.sql.SQLOutput;

/**
 * @author yycstart
 * @create 2020-08-11 18:06
 * 写一个类MyDate, 包含属性year, month, day
 * 创建两个对象, 都是今天的日期
 * 先判断两个对象的equals是否为true.
 * 打印两个对象的哈希码, 是否一致?
 */
public class MyDateTest {
    public static void main(String[] args) {

        MyDate date1 = new MyDate(1992,2,13);
        MyDate date2 = new MyDate(1998,2,13);
        System.out.println("对象1 == 对象2 \t" + date1.equals(date2));
        System.out.println("对象1的hashcode值为：" + date1.hashCode());
        System.out.println("对象2的hashcode值为：" + date2.hashCode());
    }
}
