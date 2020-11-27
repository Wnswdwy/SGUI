package com.nswdwy.test03_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yycstart
 * @create 2020-08-18 23:07
 */
public class Runner1 extends Thread{
    List<Integer> integers;
    private boolean loopover = true;

    public Boolean getLoopover() {
        return loopover;
    }

    public void setLoopover(Boolean loopover) {
        this.loopover = loopover;
    }

    @Override
    public void run() {
        integers = new ArrayList<>();
        for (int i = 0; i <100; i++) {
            int n=(int)(Math.random()*100);
            try {
                Thread.sleep((int)(Math.random()*200));
            } catch (InterruptedException e) {
                System.out.println("被打断了");;
            }
            System.out.println(Thread.currentThread().getName()+":" + "第" + (i + 1) + "个数为："+n);
            integers.add(n);
        }
        System.out.println("我要睡30秒啦");
        loopover = false;
        try {
            Thread.sleep(30*1000);

        } catch (InterruptedException e) {
            System.out.println("在睡眠30秒时被打断！");
        }
    }
}
