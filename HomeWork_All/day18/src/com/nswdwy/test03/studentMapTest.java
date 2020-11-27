package com.nswdwy.test03;

import java.util.*;

/**
 * @author yycstart
 * @create 2020-08-14 19:04
 * 请把学生名与考试分数录入到Map中，并按分数显示前三名成绩学员的名字
 */
public class studentMapTest {
    public static void main(String[] args) {
        Map< Integer,String> map = new HashMap<>();
        map.put(80,"刘备");
        map.put(99,"关羽");
        map.put(20,"张飞");
        map.put(55,"赵云");
        map.put(63,"黄忠");
        System.out.println(map);
        Set set = map.keySet();
        List list = new LinkedList(set);
//        for(Object temp:set){
//            list.add(temp);
//        }
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("前三名为：");
        for(int i = 0;i < 3; i++){
            System.out.println("分数：" + list.get(i) + "-->姓名：" +map.get(list.get(i)));
        }
    }
}
