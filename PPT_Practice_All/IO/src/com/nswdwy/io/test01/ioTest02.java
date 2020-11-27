package com.nswdwy.io.test01;

import java.io.*;

/**
 * @author yycstart
 * @create 2020-08-15 14:17
 */
public class ioTest02 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("九阴真经");
            for(int i = 0 ;i < 50 ;i++) {
                fileWriter.write("天知道，损有余而故不足");
                fileWriter.write('\n');
                fileWriter.write("事故需费时，不足胜有余");
                fileWriter.write('\n');
                fileWriter.write("其利伯其理奥");
                fileWriter.write('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("九阴真经");
            char[] temp = new char[100];
            int count ;
            while ((count = fileReader.read(temp)) != -1){
                for(int i = 0; i < count;i++){
                        System.out.print(temp[i]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
