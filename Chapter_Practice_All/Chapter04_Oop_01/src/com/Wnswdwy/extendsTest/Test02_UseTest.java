package com.Wnswdwy.extendsTest;

import javax.sound.midi.Soundbank;

/**
 * @author yycstart
 * @create 2020-07-30 10:25
 *
 * 声明一个图形工具类GraphicTools，包含如下方法：
 * 1、void printRectangle()：该方法打印5行5列*矩形
 * 2、void printRectangle(int line, int column, String sign)：
 * 该方法打印line行colomn列由sign组成的矩形
 * 3、double getTriangleArea(double base, double height)：
 * 根据底边和底边对应的高求三角形面积
 * 4、double getTriangleArea(double a, double b, double c)：
 * 根据三角形的三条边求三角形面积，如果a,b,c不能组
 * 成三角形，打印不能组成三角形，并返回0.0
 */
class GraphicTools{

    //void printRectangle()：该方法打印5行5列*矩形
    public void printRectangle(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //2、void printRectangle(int line, int column, String sign)：
    //打印line行colomn列由sign组成的矩形
    public void printRectangle(int line, int column, String sign){
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sign);
            }
            System.out.println();
        }
    }
    //3、double getTriangleArea(double base, double height)：
    //根据底边和底边对应的高求三角形面积
        public double getTriangleArea(double base, double height){
            System.out.print("三角形面积为：");
        return base * height;
        }
    //4、double getTriangleArea(double a, double b, double c)：求三角形面积
    // 如果a,b,c不能组成三角形，打印不能组成三角形，并返回0.0
    public double getTriangleArea(double a, double b, double c){
        if(a > 0 && b > 0 && c > 0 && (a+b>c) && (a + c > b) && (b+c > a)){
            double p = a + b + c;
            double area = p/2 * (p - a) * (p - b) * (p - c);
            System.out.print("组成的三角形面积为： ");
            return area;
        }
        else {
            System.out.println(a +"," + b + ","+ c +"不能组成三角形！");
            return 0.0;
        }
    }

}
public class Test02_UseTest {
    public static void main(String[] args) {
        GraphicTools tools = new GraphicTools();
        tools.printRectangle();
        System.out.println(tools.getTriangleArea(3,4));
        tools.getTriangleArea(1,2,3);
        System.out.println(Math.sqrt(tools.getTriangleArea(3,4,6)));
    }
}

