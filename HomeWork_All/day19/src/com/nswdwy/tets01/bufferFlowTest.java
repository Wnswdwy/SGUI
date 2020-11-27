package com.nswdwy.tets01;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author yycstart
 * @create 2020-08-16 12:54
 * 使用缓冲流实现文本文件的复制.
 */
public class bufferFlowTest {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("作业");
            fileWriter = new FileWriter("复制作业");
            char[] buf = new char[100];
            int temp;
            while ((temp = fileReader.read(buf) )!= -1) {
                for(int i = 0; i  < temp; i++){
                    fileWriter.write(buf[i]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileReader == null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileWriter == null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileWriter == null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }
    }
}

