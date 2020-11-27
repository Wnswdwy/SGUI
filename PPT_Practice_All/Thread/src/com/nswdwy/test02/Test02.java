package com.nswdwy.test02;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author yycstart
 * @create 2020-08-18 14:31
 *
 * //编写程序，在main方法中创建一个线程。线程每隔一定时间（200ms以内的随机时间）
 * // 产生一个0-100之间的随机整数，打印后将该整数放到集合中；
 * //共产生100个整数，全部产生后，睡眠30秒，然后将集合内容打印输出；
 * //在main线程中，唤醒上述睡眠的线程，使其尽快打印集合内容
 */
public class Test02 {
    public static void main(String[] args) {
        Runnable runnner  = new SleepRunner();
        Thread thread = new Thread(runnner);
        thread.start();
        try {
            Thread.sleep(18 * 1000);
            Thread.interrupted();
        } catch (InterruptedException e) {
            System.out.println("18秒打断");
        }

    }
}
class SleepRunner implements Runnable{
    List list = new LinkedList<Integer>();
    int number = 0;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep((int) (Math.random() * 200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            number = (int) (Math.random() * 100);
            list.add(number);
        }
        try {
            Thread.sleep(30 * 1000);
        } catch (InterruptedException e) {
            System.out.println("在睡眠30秒被打断！");
        }
        System.out.println(list);
        System.out.println("子线程执行完毕！");
    }
}