package daily2_01;

/**
 * @author yycstart
 * @create 2020-07-24 20:08
 * 案例：为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？
 *
 */
public class Test14_LongHour {
    public static void main(String[] args) {
        int hour = 89;
        int day = 0;
        int extendhour = 0;
        day = hour / 24;
        extendhour =  hour % 24;
        System.out.print("共计"+ day + "天 ，");
        System.out.println("余"+ extendhour + "小时");
    }

}
