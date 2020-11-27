package com.nswdwy_yu.test01;

/**
 * @author yycstart
 * @create 2020-08-07 20:35
 */
public class Test11 {

    public static void main(String[] args) {
        Person[] p = new Person[3];

            p[0] = new Chinese();
            p[1] = new American();
            p[2] = new Indian();
        for (int i = 0; i < 3; i++) {
            p[i].eat();
        }
    }
}
