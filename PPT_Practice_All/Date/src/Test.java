import java.util.Calendar;

/**
 * @author yycstart
 * @create 2020-08-12 11:31
 */
public class Test {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR,1996);
        calendar.set(Calendar.MONTH,10);
        calendar.set(Calendar.DAY_OF_MONTH,17);

        calendar.add(Calendar.DAY_OF_MONTH,100);
        System.out.println(calendar.getTime());
    }
}
