package com.nswdwy.net.test03;

import java.awt.print.PrinterGraphics;
import java.util.*;

/**
 * @author yycstart
 * @create 2020-08-14 14:12
 * 编写程序，在main方法中创建Map集合（使用泛型），用来存放圆的半径（key）和面积（value）；
 * 以半径为key，面积为value，将半径1-50的圆面积数据(直接取整)保存其中；
 * 将Map中的半径数据取至Set集合中；
 * 遍历Set集合的半径，逐一从Map中取出对应的面积值，并将半径和面积打印出来。
 */
public class CircleTest {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 1;i < 51; i++){
            map.put(i,(int)(Math.PI * i * i));
        }
        Set set = map.keySet();
        for(Object temp : set){
            System.out.println(temp + "--->" + map.get(temp));
        }
    }

}
