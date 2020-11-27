package com.nswdwy.test02;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author yycstart
 * @create 2020-08-19 14:41
 */
public class HashMapTest {
    public static void main(String[] args) throws Exception {
        //已知类，通过类的静态方法属性class来获取，最为安全
        Class claz1 = HashMap.class;
        System.out.println(claz1);
        System.out.println("-----------------");
        HashMap<Object, Object> map = new HashMap<>();
        Class<? extends HashMap> aClass = map.getClass();
        System.out.println(aClass);
        System.out.println("-----------------");
        Class<?> forName = Class.forName(HashMap.class.getName());
        System.out.println(forName);
        System.out.println("-------------");
        ClassLoader classLoader = HashMapTest.class.getClassLoader();
        Class<?> aClass3 = classLoader.loadClass(HashMap.class.getName());
        System.out.println(aClass3);


    }
}
