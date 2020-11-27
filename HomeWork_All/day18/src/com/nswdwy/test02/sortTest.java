package com.nswdwy.test02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author yycstart
 * @create 2020-08-14 18:47
 * 2 请从命令行参数获取 10个整数字符串,并将它们转为整数并保存到List中，
 * 并按倒序、从大到小的顺序显示出来
 */
public class sortTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        for(int i = 0; i < 10; i++){
            int number = Integer.parseInt(args[i]);
            list.add(number);
        }
        System.out.println("最初集合：" + list);
        Collections.sort(list);
        System.out.println("从小到大排序后为" + list);
        Collections.reverse(list);
        System.out.println("从大到小排序后为：" + list);

    }
}
