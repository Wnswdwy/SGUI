package com.nswdwy.test01;

import java.util.*;

/**
 * @author yycstart
 * @create 2020-08-18 19:04
 * 给定一个字符串, 统计每个字符出现的次数
 */
public class Test01 {
    public static void main(String[] args) {
        String string = "aabbcccdddsss";
        char[] chars = string.toCharArray();
        Set<Character> set = new HashSet<>();
        List<Character> list = new LinkedList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            set.add(chars[i]);
        }
        list.addAll(set);
        int[] number = new int[list.size()];
        for(int i = 0; i< list.size();i++){
            number[i] = 0;
            for (int j = 0; j < string.length() ; j++) {
                if(list.get(i) == chars[j]){
                    number[i] ++;
                }
            }
        }
       /*  for(int i = 0; i < list.size();i ++) {
            System.out.println("list" + i + " " + list.get(i))  ;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("numbers" + i + " " + number[i] );
        }*/

        for(int i = 0; i < list.size();i ++) {
            map.put(list.get(i),number[i]);
        }
        System.out.println(map);

    }
}
