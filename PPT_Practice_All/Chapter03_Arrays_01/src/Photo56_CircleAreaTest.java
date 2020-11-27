/**
 * @author yycstart
 * @create 2020-07-29 14:18
 */
public class Photo56_CircleAreaTest {
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.r = 2;
        double areas = cir.Areas();
        System.out.println("圆的面积为："+ areas);
    }
}
class Circle{
    int r = 0;
    public double Areas(){
        System.out.println("圆的半径为："+ r);
        return Math.PI  * r * r;
    }
}