
/**
 * @author yycstart
 * @create 2020-07-29 20:11
 *
 * 声明一个日期类型MyDate：有属性：年year,月month，日day。
 * 创建2个日期对象，分别赋值为：你的出生日期，你对象的出生日期，并显示信息。
 */
public class Test04_Date {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate();
        System.out.print("我的出生日期是\t");
        date1.year = 2020;
        date1.month = 1;
        date1.day = 1;
        date1.info();
        System.out.print("我对象的出生日期是\t");
        date2.year = 2020;
        date2.month = 1;
        date2.day = 1;
        date2.info();


    }
}
class MyDate{
    int year,month,day;
    public void info(){
        System.out.println( year + "年" + month + "月" + day + "日");
    }
}
