package com.nswdwy.s;

/**
 * @author yycstart
 * @create 2020-08-05 18:36
 */
public class Circle extends GeometricObject {
    private double radius;
    public Circle(){
        color="white";
        weight=1.0;
        this.radius=1.0;
    }
    public  Circle(double radius){
        color="white";
        weight=1.0;
        this.radius=radius;
    }
    public Circle(double radius,String color,double weight){
        this.color=color;
        this.weight=weight;
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return getRadius()*getRadius()*Math.PI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
