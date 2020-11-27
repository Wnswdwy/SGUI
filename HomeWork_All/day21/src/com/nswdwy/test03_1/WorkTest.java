package com.nswdwy.test03_1;

/**
 * @author yycstart
 * @create 2020-08-18 23:06
 */

public class WorkTest {
    public static void main(String[] args) {
        Thread thread1= new Runner1();
        thread1.setName("子线程1");
        thread1.start();
        Runnable runner2 = new Runner2((Runner1) thread1);
        Thread thread2 = new Thread(runner2);
        thread2.setName("子线程2");
        thread2.start();
    }
}

