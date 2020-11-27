package com.nswdwy.io.test01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author yycstart
 * @create 2020-08-15 15:43
 */
public class FileCopy {
    public static void main(String[] args) {
        // 编写程序FileCopy.java，在测试方法中，将FileCopy.java复制为FileCopy.java.bak文件；
        // 查看FileCopy.java.bak文件的内容，验证复制是否正确。
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("FileCopy.java");
            fileWriter = new FileWriter("FileCopy.java.bak");
            char[] buf = new char[100];
            int temp;
            while ((temp = fileReader.read(buf) )!= -1) {
                for(int i = 0; i  < temp; i++){
                    fileWriter.write(buf[i]);
                }
                //把读到的数据 再 写文件
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

