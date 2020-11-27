package com.wnswdwy.test02;

/**
 * @author yycstart
 * @create 2020-08-02 17:26
 */
public class Test3 {
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        System.out.println(f.getInfo());
        System.out.println(s.getInfo());
        s.test();
        System.out.println("-----------------");
        s.setInfo("大硅谷");
        System.out.println(f.getInfo());
        System.out.println(s.getInfo());
        s.test();
    }
}

class Father {
    private String info = "atguigu";

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}

class Son extends Father {
    private String info = "尚硅谷";

    public void test() {
        System.out.println(this.getInfo());
        System.out.println(super.getInfo());
    }
}

