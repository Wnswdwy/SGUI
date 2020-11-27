package com.nswdwy_yu.test03;

/**
 * @author yycstart
 * @create 2020-08-07 23:06
 */
public class ComparableCircle extends Circle implements CompareObject {

    public ComparableCircle(double radius) {
        super(radius);
    }

    public int compareTo(Object obj) {
        if (this.getRadius() > ((ComparableCircle) obj).getRadius()) {
            return 1;
        } else if (this.getRadius() == ((ComparableCircle) obj).getRadius()) {
            return 0;
        }
        return -1;
    }
}
