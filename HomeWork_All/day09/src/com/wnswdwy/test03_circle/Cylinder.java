package com.wnswdwy.test03_circle;

/**
 * @author yycstart
 * @create 2020-08-02 18:03
 */
public class Cylinder extends Circle{
    private  double length;

    public Cylinder() {
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double findVolme(){
       return  findArea() * length;
    }
}
