package com.nswdwy.test01;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author yycstart
 * @create 2020-08-18 20:47
 */
public class Test000 {
    @Test
    public void test(){
        FileReader fileReader = null;
        FileWriter fileWriter = null;

                try {
                    fileReader = new FileReader("作业");
                    fileWriter = new FileWriter("赋值");
                    int ch;
                    while ((ch = fileReader.read()) != -1) {
                        fileWriter.write(ch);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    if(fileReader != null){
                        try {
                            fileReader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
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
