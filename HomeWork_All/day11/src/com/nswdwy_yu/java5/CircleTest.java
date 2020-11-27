package com.nswdwy_yu.java5;

/**
 * @author yycstart
 * @create 2020-08-04 15:48
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.3);
        Circle circle2 = new Circle(5.3);
        System.out.println("两个对象的颜色是否相等：" + circle1.color.equals(circle1.color));
        System.out.println("两个对象的半径是否相等："+circle1.equals(circle2));
        System.out.println("第一个对象的半径为：" + circle1.toString() + ",第二个对象的半径为：" + circle2.toString());
    }
}
