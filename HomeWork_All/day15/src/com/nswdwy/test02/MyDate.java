package com.nswdwy.test02;


import java.util.Objects;

/**
 * @author yycstart
 * @create 2020-08-11 18:04
 *
 * 写一个类MyDate, 包含属性year, month, day
 * 创建两个对象, 都是今天的日期
 * 先判断两个对象的equals是否为true.
 * 打印两个对象的哈希码, 是否一致?
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (getClass() == o.getClass()) {
            MyDate myDate = (MyDate) o;
            return year == myDate.year &&
                    month == myDate.month &&
                    day == myDate.day;
        }
        return false;
    }


    public int hashCode() {
        return Integer.hashCode(year + month + day);
    }
}
