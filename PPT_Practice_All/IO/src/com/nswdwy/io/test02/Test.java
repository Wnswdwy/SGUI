package com.nswdwy.io.test02;

import java.io.*;

/**
 * @author yycstart
 * @create 2020-08-17 14:27
 */
public class Test {

    @org.junit.Test
    public void test01(){
        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileInputStream = new FileInputStream("LinkedList.java");
            inputStreamReader = new InputStreamReader(fileInputStream,"gbk");
            bufferedReader= new BufferedReader(inputStreamReader);
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileInputStream == null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
