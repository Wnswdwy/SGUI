package com.nswdwy.test01;

import java.io.*;

/**
 * @author yycstart
 * @create 2020-08-18 11:29
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Runner runner = new Runner();
        Thread thread = new Thread(runner);
        thread.start();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            while (true) {
                try {
                    if (!((line = bufferedReader.readLine()) != null)){
                        if (line.equals("P")) {
                            runner.setFlag(false);
                            break;
                        }
                    }

            } catch (IOException e) {
                    e.printStackTrace();
                }
            }
}

static class Runner implements  Runnable{

    private boolean flag = true;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        while(flag) {
                System.out.println(Thread.currentThread().getName() + ":" + (int)(Math.random() * 100));
            }
        }
    }
}