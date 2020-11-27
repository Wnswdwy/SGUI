package com.nswdwy.test04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yycstart
 * @create 2020-08-14 20:03
 */
public class sortTest {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add((int) (Math.random() * 20));
        }
        System.out.println(list1);
        System.out.println(max(list1));

        List<Double> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list2.add(Math.random() * 20);
        }
        System.out.println(list2);
        System.out.println(max(list2));

    }

    public static Number max(List<? extends Number> list) {
        Number max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            Number number = list.get(i);
            if (max.doubleValue() < number.doubleValue()) {
                max = number;
            }
        }
        return max;
    }
}


