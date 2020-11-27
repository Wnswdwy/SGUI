package com.nswdwy.s;

/**
 * @author yycstart
 * @create 2020-08-05 18:38
 */
public class CircleTest {
    public static void main(String[] args) {
        CircleTest test=new CircleTest();
        Circle circle1=new Circle(2);
        MyRectangle rectangle1=new MyRectangle(2,3,"white",3);
        System.out.println(circle1.equals(rectangle1));
        test.displayGeometricObject(circle1);
        test.displayGeometricObject(rectangle1);
        test.equalsArea(circle1,rectangle1);
    }
    public boolean equalsArea(GeometricObject obj1,GeometricObject obj2){
        if(obj1.findArea()==obj2.findArea()){return true;}
        return false;
    }
    public void displayGeometricObject(GeometricObject obj){
        System.out.println("面积为："+obj.findArea());
    }

}
