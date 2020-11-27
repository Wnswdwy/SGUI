package com.nswdwy.io.test01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author yycstart
 * @create 2020-08-15 15:24
 */
public class ioTest03 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("name.txt");
            String[] name = {"刘备","张飞","关羽","赵云","黄忠","潘凤","诸葛亮","黄月英","周瑜"};
            for(int i = 0; i < name.length; i++){
                char[] chars = name[i].toCharArray();
                fileWriter.write(chars, 1, chars.length - 1);
                fileWriter.write(13);
                fileWriter.write(10);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
