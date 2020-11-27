package com.nswdwy.test02;

import java.util.ArrayList;
        import java.util.HashSet;
        import java.util.List;
        import java.util.Set;

/**
 * @author yycstart
 * @create 2020-08-12 18:12
 * 创建一个Set集合, 保存20个100以内的随机整数, 把所有数据导入到另一个List集合中
 * 对List集合排序, 求平均值.
 */
public class SortTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        List list = new ArrayList();
        while(set.size() != 20){
            int num = (int)(Math.random() * 100);
            set.add(num);
        }
        System.out.println("创建的set集合为：" + set);
        for(Object temp : set){
            list.add(temp);
        }
        System.out.println("导入后list集合为：" + list);
        //排序
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if((Integer)list.get(j) >  (Integer) list.get(j + 1)) {
                    Integer temp = (Integer) list.get(j);
                    list.set(j,(Integer)list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
        System.out.println("排序后list集合为：" + list);
        //求平均值.
        int sum = 0;
        for(Object temp : list){
            sum += (Integer)temp;
        }
        double arv = sum * 1.0 / list.size();
        System.out.println("平均值为：" + arv);
    }
}
