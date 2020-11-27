package com.nswdwy_yu.java;

import java.util.Objects;

/**
 * @author yycstart
 * @create 2020-08-04 19:08
 */
public class MyData {
    int years;
    int mongth;
    int days;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return years == myData.years &&
                mongth == myData.mongth &&
                days == myData.days;
    }


}
