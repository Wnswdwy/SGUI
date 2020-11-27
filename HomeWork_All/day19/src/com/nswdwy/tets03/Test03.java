package com.nswdwy.tets03;

import org.junit.Test;

import java.io.*;

/**
 * @author yycstart
 * @create 2020-08-16 22:50
 */
public class Test03 {
    @Test
    public void work1() {
        // 使用Object输入输出流,写入50个100以内的随机整数, 再读出来打印输出
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("50个随机数");
            bos = new BufferedOutputStream(fos);
            oos = new ObjectOutputStream(bos);
            for (int i = 0; i < 50; i++) {
                oos.writeInt((int)(Math.random() * 100));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (Exception e2) {
            }
        }
    }

    @Test
    public void work2() {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("50个随机数");
            bis = new BufferedInputStream(fis);
            ois = new ObjectInputStream(bis);
            for (int i = 0; i < 50; i++) {
                System.out.println(ois.readInt());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (Exception e2) {
            }
        }
    }
}

