package com.nswdwy.enum02;

/**
 * @author yycstart
 * @create 2020-08-10 18:49
 * 创建一个Color枚举类，
 * 1)有 RED,BLUE,BLACK,YELLOW,GREEN这个五个枚举值；
 * 2)Color有三个属性redValue，greenValue，blueValue，
 * 3)创建构造方法，参数包括这三个属性，
 * 4)每个枚举值都要给这三个属性赋值，三个属性对应的值分别是
 * red：255,0,0   * blue:0,0,255  black:0,0,0  yellow:255,255,0  green:0,255,0
 * 5)重写toString方法显示三属性的值
 * 6)在Color中添加抽象方法meaning，不同的枚举类的meaning代表的意思各不相同
 */
public class ColorTest {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        Color[] cl = Color.values();
        System.out.println(Color.meaning(cl[a]));
    }
}
enum Color{

    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);

    private final int redValue;
    private final int greenValue;
    private final int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    public int getRedValue() {
        return redValue;
    }

    public int getGreenValue() {
        return greenValue;
    }

    public int getBlueValue() {
        return blueValue;
    }
    //抽象方法meaning，
    static String meaning(Color color){
        switch (color){
            case RED:
                return "红色";
            case BLUE:
                return "蓝色";
            case BLACK:
                return "黑色";
            case YELLOW:
                return "黄色";
            case GREEN:
                return "绿色";
        }
        return null;
    }
    @Override
    public String toString() {
        return "Color{" +
                "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue +
                '}';
    }
}