package com.nswdwy.tets02;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author yycstart
 * @create 2020-08-16 17:03
 */
public class fileInputOutputStreamTest {
    public static void main(String[] args) {
        //被读取的文件对象
        String path = "F:\\java\\111.wmv";
        //被写入的文件对象
        String resultpath = "F:\\\\java\\\\123.wmv";

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            long start = System.currentTimeMillis();
            fis = new FileInputStream(path);
            fos = new FileOutputStream(resultpath);

            int result;
            while ((result = fis.read()) != -1) {
                //将读取到的内容写入到新的文件中
                fos.write(result);
            }
            //计算读取结束的时间
            long exit = System.currentTimeMillis();
            //计算拷贝所用的时长
            System.out.println(exit - start);
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}