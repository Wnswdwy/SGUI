package com.nswdwy_yu.java4;

/**
 * @author yycstart
 * @create 2020-08-04 19:27
 */
public class MyRectangle extends GeomentrivObject{
    private double width;
    private double heigh;

    /**
     *
     * @param color      颜色
     * @param weight     重量
     * @param width      宽度
     * @param heigh       高
     */
    public MyRectangle(String color, double weight, double width, double heigh) {
        super(color, weight);
        this.width = width;
        this.heigh = heigh;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    public double findArea(){
        return width * heigh;
    }

}
