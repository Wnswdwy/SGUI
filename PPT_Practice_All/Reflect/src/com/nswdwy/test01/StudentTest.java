package com.nswdwy.test01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author yycstart
 * @create 2020-08-19 11:10
 */
public class StudentTest {
    public static void main(String[] args) {
        try {
           /* Class clazz = Class.forName("com.nswdwy.test01.Student");
            Object object = clazz.newInstance();
            Field name2 = clazz.getDeclaredField("name");
            name2.setAccessible(true);
            name2.set(object,"Mary");
            System.out.println(name2.get(object));*/
            /*Field name = clazz.getField("name");
            name.set(object,"Bob");
            System.out.println(object);
            Field grade = clazz.getField("grade");
            grade.set(object,1);
            System.out.println(object);
            Field score = clazz.getField("score");
            score.set(object,85);*/
           /* Class clazz = Class.forName("com.nswdwy.test01.Student");
            Constructor constructor = clazz.getConstructor(String.class, int.class, double.class);
            Object object = constructor.newInstance("萧峰", 3, 60.0);
            System.out.println(object);
*/
            Class clazz = Class.forName("com.nswdwy.test01.Student");
            Object object = clazz.newInstance();
            Method name2 = clazz.getDeclaredMethod("play",String.class, int.class, double.class);
            name2.setAccessible(true);
            Object m = name2.invoke(object, "打羽毛", 12);
            System.out.println(m);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
