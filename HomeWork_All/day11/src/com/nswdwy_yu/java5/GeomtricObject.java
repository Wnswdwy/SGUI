package com.nswdwy_yu.java5;

/**
 * @author yycstart
 * @create 2020-08-04 15:36
 */
public class GeomtricObject {
    protected String color;
    protected double weight;

    protected GeomtricObject() {
        color = "white";
        weight = 1.0;
    }
    protected  GeomtricObject(String color,double weight){
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}