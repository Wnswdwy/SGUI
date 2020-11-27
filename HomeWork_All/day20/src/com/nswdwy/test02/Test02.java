package com.nswdwy.test02;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author yycstart
 * @create 2020-08-17 18:34
 */
public class Test02 {
    public static void main(String[] args) {
        Person p1 = new Person("Tom",12,98.2);
        Person p2 = new Person("刘备",42,58.2);
        Person p3 = new Person("Jone",22,48.2);
        Person p4 = new Person("张飞",20,38.2);
        Set set = new HashSet();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("test02.java"));

            objectOutputStream.writeObject(set);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("test02.java"));

            Set<Person> o = (Set<Person>) objectInputStream.readObject();
            System.out.print(o.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }  finally {
            if(objectInputStream != null){
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Person implements Serializable {
    private String name ;
    private int age;
    private double score;

    public Person() {
    }

    public Person(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}