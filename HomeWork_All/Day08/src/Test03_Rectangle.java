/**
 * @author yycstart
 * @create 2020-07-31 18:40
 *
 * 编写Test02类，在main方法中，
 * 	（1）创建一个Rectangle[]数组，长度为5
 * 	（2）并创建5个Rectangle的矩形对象，放到数组中，
 * 	矩形的长和宽随机生成[1,10.0)范围内的值
 * 	（3）遍历显示
 * 	（4）按照面积从小到大排序
 * 	（5）再次遍历显示
 */
public class Test03_Rectangle {
    public static void main(String[] args) {
        //创建一个Rectangle[]数组，长度为5
       Rectanle[] as = new Rectanle[5];
       Rectanle ret = new Rectanle();
        for (int i = 0; i < 5; i++) {
            as[i] = new Rectanle();
            as[i].setLength((int)(Math.random() * 100)/10.0 + 1 );
            as[i].setWise((int)(Math.random() * 100)/10.0 + 1 );

            System.out.println("第 "+ (i+1) + " 个矩形，长为"+
                    as[i].getWise() + " 宽为："+  as[i].getLength()+
                    "  面积为：" + as[i].Area());
        }
        ret.sortResult(as);
        System.out.println("排序后：");
        for (int i = 0; i < as.length; i++) {
            System.out.println("第 "+ (i+1) + " 个矩形，长为"+
                    as[i].getWise() + " 宽为："+  as[i].getLength()+
                    "  面积为：" + as[i].Area());
        }

    }
}

class Rectanle {
    private double length;
    private double wise;

    public void setWise(double wise) {
        this.wise = wise;
    }

    public double getWise() {
        return wise;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double Area() {
        return wise * length;
    }

    public void sortResult(Rectanle[] as) {
        for (int i = 0; i < as.length; i++) {
            for (int j = 0; j < as.length - 1; j++) {
                if (as[j].Area() > as[j + 1].Area()) {
                    Rectanle a = as[j];
                    as[j] = as[j + 1];
                    as[j + 1] = a;
                }
            }
        }
    }
}
