package com.nswdwy.test03;

/**
 * @author yycstart
 * @create 2020-08-18 15:39
 */
public class Test {
    public static void main(String[] args) {
        Runnable runner = new Counter();
        Thread thread1 = new Thread(runner);
        thread1.setName("线程1");
        thread1.start();
        Thread thread2 = new Thread(runner);
        thread2.setName("线程2");

        thread2.start();
    }
}
class  Counter implements Runnable{
    int counter = 200;
    @Override
    public void run() {

        for(int i = 0; i < 50;i++){
            counter -=2 ;
            synchronized (this) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " :" + counter);
            }
        }
    }
}