/**
 * @author yycstart
 * @create 2020-07-31 19:30
 *
 * （1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，
 * 一个findArea()方法返回圆的面积。
 * （2）定义一个类PassObject，在类中定义一个方法printAreas()，
 * 该方法的定义如下：public void printAreas(Circle c, int time)
 * 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 * 例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积
 * （3）在main方法中调用printAreas()方法，调用完毕后输出当前半径值。
 *
 */
public class Test04_Circle {
    public static void main(String[] args) {
        PassObject as = new PassObject();
        as.printAreas(new Circle(), 5);
    }
}
//定义一个Circle类，包含一个double型的radius属性代表圆的半径，
// * 一个findArea()方法返回圆的面积。
class Circle{
    private  double radius;
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double Area(){
        return Math.PI * radius * radius;
    }

}
//（2）定义一个类PassObject，在类中定义一个方法printAreas()，
// * 该方法的定义如下：public void printAreas(Circle c, int time)
// * 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
// * 例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积
class PassObject{
    public void printAreas(Circle c, int time){
        System.out.println("\t\t\tRadius\t\t\t\t\tArea\t\t\t");
        int i;
        for (i= 0; i < time; i++) {
            c.setRadius(i+1);
            System.out.println("\t\t\t" + c.getRadius() + " \t\t\t\t\t" + c.Area());
        }
        System.out.println("now radius is ：" + (double)(i+1));
    }
}