package com.wnswdwy.test03_circle;

/**
 * @author yycstart
 * @create 2020-08-02 18:00
 */
public class Circle {
    private double radius;

    public Circle() {
        radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return Math.PI * radius *radius;
    }
}
