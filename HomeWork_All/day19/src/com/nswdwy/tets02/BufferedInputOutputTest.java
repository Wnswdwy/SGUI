package com.nswdwy.tets02;

import java.io.*;

/**
 * @author yycstart
 * @create 2020-08-16 23:06
 */
public class BufferedInputOutputTest {

    public static void main(String[] args) {

        //被拷贝对象
        String path = "F:\\java\\111.wmv";

        //拷贝到的存放的位置
        String resultpath = "F:\\\\java\\\\124.wmv";

        BufferedInputStream fis = null;
        BufferedOutputStream fos = null;

        try {
            //计算开始读取的时间
            long start = System.currentTimeMillis();
            //真正去执行的还是FileInputStream/FileOutputStream
            fis = new BufferedInputStream(new FileInputStream(path));
            fos = new BufferedOutputStream(new FileOutputStream(resultpath));
            int result;
            while ((result = fis.read()) != -1) {
                //将读取到的内容写入到新的文件中
                fos.write(result);
            }
            long end = System.currentTimeMillis();
            //计算读取结束的时间
            System.out.println(end - start);

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            //关闭输入流
            if (fis != null) {

                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //关闭输出流
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