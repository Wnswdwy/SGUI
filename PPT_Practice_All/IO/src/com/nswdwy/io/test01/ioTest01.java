package com.nswdwy.io.test01;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author yycstart
 * @create 2020-08-15 11:51
 */
public class ioTest01 {
    @Test
    public  void main1() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("每日单词");
            int item ;
            int count = 0;

            while((item = fileReader.read()) != -1){
//                if(item == 10){
//
//                }
                System.out.print((char)item);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
