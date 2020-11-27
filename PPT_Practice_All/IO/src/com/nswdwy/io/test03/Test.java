package com.nswdwy.io.test03;

import java.io.*;

/**
 * @author yycstart
 * @create 2020-08-17 15:19
 */
public class Test {
    public static void main(String[] args) {
        InputStream is = System.in;
        InputStreamReader inputStreamReader = null;
        BufferedReader  bufferedReader = null;
        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedWriter bufferedWriter = null;


        try {
            String line ;
            inputStreamReader = new InputStreamReader(is);
            bufferedReader = new BufferedReader(inputStreamReader);
            fileOutputStream = new FileOutputStream("keyboard_gbk.txt");
            outputStreamWriter = new OutputStreamWriter(fileOutputStream,"gbk");
            bufferedWriter = new BufferedWriter(outputStreamWriter);
            while((line = bufferedReader.readLine()) != null ){
                    if(line.equals("quit")){
                        break;
                    }
                   bufferedWriter.write(line);
                    bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bufferedWriter != null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
