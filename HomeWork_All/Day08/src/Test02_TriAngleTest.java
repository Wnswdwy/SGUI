/**
 * @author yycstart
                * @create 2020-07-31 18:26
                * 编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边长base和高height，
 * 同时声明公共方法访问私有变量。
 * 此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 *
 */
        public class Test02_TriAngleTest {
            public static void main(String[] args) {
                TriAngle te = new TriAngle();
                te.setBase(5.7);
                te.setHeigh(7.5);
                System.out.println("三角形面积为："+ te.getBase() * te.getHeigh());
    }
}


//TriAngle类中声明私有的底边长base和高height
class TriAngle{
    private double base;
    private double heigh;

    /**
     *
     * @param base 长
     */
    public void setBase(double base ){
        this.base = base;
    }
    public double getBase(){
        return base;
    }

    /**
     *
     * @param heigh 高
     */
    public void setHeigh(double heigh){
        this.heigh = heigh;
    }
    public  double getHeigh(){
        return  heigh;
    }

}