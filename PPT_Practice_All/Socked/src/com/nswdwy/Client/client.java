package com.nswdwy.Client;

import sun.java2d.pipe.SpanIterator;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author yycstart
 * @create 2020-08-21 9:30
 */
public class client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1", 9988);

        //客户端收消息
        InputStream inputStream = client.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s = bufferedReader.readLine();
        System.out.println(s);
        bufferedReader.close();
        client.close();

    }
}
