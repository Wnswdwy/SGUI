package com.nswdwy.test04;

/**
 * @author yycstart
 * @create 2020-08-17 19:52
 */
public class Test04 {
    public static void main(String[] args) {
        Runnable runnable = new Runner();
        Thread thread = new Thread(runnable);
        thread.start();
        thread.setName("子线程");

        Thread.currentThread().setName("主线程");

        for (int i = 1; i <= 100; i++) {
            if(i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}
class Runner implements Runnable {

    private int count = 100;

    @Override
    public void run() {
        for (int i = 1; i <= count; i++) {
            if(i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}