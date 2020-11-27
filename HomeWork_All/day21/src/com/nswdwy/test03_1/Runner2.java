package com.nswdwy.test03_1;

/**
 * @author yycstart
 * @create 2020-08-18 23:06
 */
public class Runner2 implements Runnable {
    private Runner1 thread1;

    public Runner2(Runner1 thread1) {
        this.thread1 = thread1;
    }

    @Override
    public void run() {
        while (thread1.getLoopover()) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        thread1.interrupt();
        System.out.println(Thread.currentThread().getName() + ":" + thread1.integers);
    }
}
