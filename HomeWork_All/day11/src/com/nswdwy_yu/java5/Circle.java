package com.nswdwy_yu.java5;

/**
 * @author yycstart
 * @create 2020-08-04 15:35
 */
public class Circle extends GeomtricObject {
    private  double radius;
    public Circle(){
        super();
        radius = 1.0;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius,String color ,double weight){
        super(color,weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 计算圆的面积
     * @return  圆的面积
     */
    public double findArea(){
        return Math.PI * radius * radius;
    }
    public boolean equals(Circle cir) {
        if (this == cir) return true;
        if (cir == null || getClass() != cir.getClass()) return false;
        return radius == cir.getRadius();
    }

    @Override
    public String toString() {
        return  "radius=" + radius ;
    }
}
