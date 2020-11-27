package com.nswdwy_yu.java4;

/**
 * @author yycstart
 * @create 2020-08-04 19:16
 */
public class GeomentrivObject {
    private String color;
    private double weight;

    public GeomentrivObject() {
    }

    public GeomentrivObject(String color, double weight) {
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
    public double finaArea(){
        return 0.0;
    }
}
