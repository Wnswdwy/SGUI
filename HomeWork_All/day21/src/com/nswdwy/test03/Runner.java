package com.nswdwy.test03;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yycstart
 * @create 2020-08-18 18:10
 *
 * 编写程序，在main方法中创建两个线程。线程1每隔一定时间（200ms以内的随机时间）产生一个0-100之间的随机整数，
 *  * 打印后将该整数放到集合中；
 *  * 共产生100个整数，全部产生后，睡眠30秒；
 *  * 在线程2中，唤醒上述睡眠的线程1，并获取线程1中的集合并打印集合内容。
 */
public class Runner implements Runnable{
    boolean isf = true;

    public Runner() {
    }

    public Runner(boolean isf) {
        this.isf = isf;
    }

    public boolean isIsf() {
        return isf;
    }

    public void setIsf(boolean isf) {
        this.isf = isf;
    }

    @Override
    public void run() {
        List<Integer> list = new ArrayList<>();
        int num = 0;
        while( isf && num < 100) {
            int number = (int) (Math.random() * 100);
            System.out.println("随机产生的第 " + (num + 1) + "个数为：" + number);
            list.add(number);

            while(isf) {
                try {
                    Thread.sleep(30 * 1000);
                } catch (InterruptedException e) {
                    System.out.println("我在休眠后30s被打断了！");
                }
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + list.get(i));
                }
                isf = false;
            }
        }
    }
}
