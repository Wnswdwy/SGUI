package com.nswdwy_yu.java4;

/**
 * @author yycstart
 * @create 2020-08-04 19:33
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest cc = new GeometricTest();
        Circle geo1 = new Circle(12.1, "white", 5.2);
        MyRectangle geo2 = new MyRectangle("red", 12.1, 5, 2);


        System.out.println(cc.equalsArea(geo1, geo2));
        System.out.println("圆的面积为："+ cc.displayGeomentrivObject(geo1));
        System.out.println("长方形的面积为：" + cc.displayGeomentrivObject(geo2));
    }

    public boolean equalsArea(GeomentrivObject ob1, GeomentrivObject ob2) {
        Circle cir = (Circle) ob1;
        MyRectangle rec = (MyRectangle) ob2;
        if (cir.equals(rec)) {
            return true;
        }
        if (rec == null || rec == null) {
            return false;
        }
        return cir.findArea() == rec.findArea();
    }

    public double displayGeomentrivObject(GeomentrivObject geo) {
        if (geo instanceof Circle) {
            Circle cir = (Circle) geo;
            return cir.findArea();
        } else if (geo instanceof MyRectangle) {
            MyRectangle rec = (MyRectangle) geo;
            double area = rec.findArea();
            return area;
        }
        return 0;
    }
}
