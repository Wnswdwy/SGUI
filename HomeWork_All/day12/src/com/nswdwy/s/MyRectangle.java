package com.nswdwy.s;

/**
 * @author yycstart
 * @create 2020-08-05 18:38
 */
public class MyRectangle extends GeometricObject {
    private double width;
    private double height;
    public MyRectangle(double width,double height,String color,double weight){
        super(color,weight);
        this.height=height;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double findArea(){
        return getHeight()*getWidth();
    }
}
