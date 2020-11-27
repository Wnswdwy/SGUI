package com.nswdwy.test03;

import java.util.TreeMap;

/**
 * @author yycstart
 * @create 2020-08-18 18:08
 * 编写程序，在main方法中创建两个线程。线程1每隔一定时间（200ms以内的随机时间）产生一个0-100之间的随机整数，
 * 打印后将该整数放到集合中；
 * 共产生100个整数，全部产生后，睡眠30秒；
 * 在线程2中，唤醒上述睡眠的线程1，并获取线程1中的集合并打印集合内容。
 */
public class Test03 {
    public static void main(String[] args) {
        Runnable runner1 = new Runner();
        Thread thread1 = new Thread(runner1);
        thread1.start();
        Runnable runner = new Runner2();
        Thread thread2 = new Thread(runner);
        thread2.start();



    }
}
