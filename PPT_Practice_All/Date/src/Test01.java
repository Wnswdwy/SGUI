import java.time.LocalDate;

/**
 * @author yycstart
 * @create 2020-08-12 12:00
 */
public class Test01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        LocalDate localDate1 = localDate.withYear(1996).withMonth(10).withDayOfMonth(17).plusDays(100);
        System.out.println(localDate1);
    }
}
