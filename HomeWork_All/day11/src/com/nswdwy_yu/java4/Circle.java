package com.nswdwy_yu.java4;

/**
 * @author yycstart
 * @create 2020-08-04 19:21
 */
public class Circle extends GeomentrivObject{
    private double radius;

    /**
     *
     * @param radius   半径
     * @param color    颜色
     * @param weight    高
     */
    public Circle(double radius,String color,double weight) {
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
     *
     * @return    返回圆的面积
     */
    public double findArea(){
        return  Math.PI * this.radius * this.radius;
    }
}
