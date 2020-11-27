package com.nswdwy.net;

import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.scene.chart.BubbleChart;
import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author yycstart
 * @create 2020-08-27 10:54
 */
public class NetTest {
    @Test
    public void Server() throws IOException {
        System.out.println("服务器在端口9898监听中.....");
        ServerSocket serverSocket = new ServerSocket(9898);
        Socket socket = serverSocket.accept();
        System.out.println(serverSocket);
        //服务器接收
        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s = bufferedReader.readLine();
        System.out.println(s);
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }

    @Test
    public void Client() throws IOException {
        Socket socket = new Socket("127.0.0.1", 9898);
        System.out.println(socket);

        //客户端发消息
        OutputStream outputStream = socket.getOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write("你好，我是客户端，收到请回答！");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();
        socket.close();
    }
}
