package com.nswdwy.test03;

import java.util.*;

/**
 * @author yycstart
 * @create 2020-08-14 19:40
 */
public class internetTest {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
        linkedHashMap.put("张飞", 56);
        linkedHashMap.put("赵云", 88);
        linkedHashMap.put("关羽", 84);
        linkedHashMap.put("华佗", 90);
        linkedHashMap.put("贾诩", 87);
        linkedHashMap.put("刘备", 86);
        linkedHashMap.put("曹操", 88);
        linkedHashMap.put("周瑜", 89);
        linkedHashMap.put("阿斗", 65);
        linkedHashMap.put("吕布", 45);
        linkedHashMap.put("许褚", 78);

        ArrayList<Map.Entry<String,Integer>> arrayList = new ArrayList<>(linkedHashMap.entrySet());

        Collections.sort(arrayList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        System.out.println(arrayList.get(arrayList.size()-1));
        System.out.println(arrayList.get(arrayList.size()-2));
        System.out.println(arrayList.get(arrayList.size()-3));
    }
}
