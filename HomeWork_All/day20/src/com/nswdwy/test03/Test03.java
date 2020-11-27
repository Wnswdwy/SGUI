package com.nswdwy.test03;


import java.io.File;

/**
 * @author yycstart
 * @create 2020-08-17 19:23
 */
public class Test03 {
    public static void main(String[] args) {
        File file = new File("D:\\aaa");
        mydelect(file);
        file.delete();
    }
    public static void mydelect(File file){
        File[] files = file.listFiles();
        for(File fi : files){
            if(!fi.isFile()){
                mydelect(fi);
            }
            fi.delete();
        }
    }
}
