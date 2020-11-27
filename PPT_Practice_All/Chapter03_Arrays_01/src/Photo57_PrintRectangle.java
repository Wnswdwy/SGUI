/**
 * @author yycstart
 * @create 2020-07-29 14:29
 *
 * 3.1 编写程序，声明一个method方法，
 * 在方法中打印一个10*8 的*型矩形，在main方法中调用该方法。
 */
public class Photo57_PrintRectangle {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.method();
    }
}


class  Rectangle {
    public void method(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}