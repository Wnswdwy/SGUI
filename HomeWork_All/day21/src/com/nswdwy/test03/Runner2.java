package com.nswdwy.test03;

/**
 * @author yycstart
 * @create 2020-08-18 21:12
 */
public class Runner2 implements Runnable{
    private Runner runner;

    public Runner2(Runner runner) {
        this.runner = runner;
    }

    public Runner2() {
    }

    public Runner getRunner() {
        return runner;
    }

    public void setRunner(Runner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(20*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       runner.setIsf(false);
    }
}
