
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yycstart
 * @create 2020-08-12 10:56
 */
public class ClockTest {
    public static void main(String[] args) {

        while(true) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            System.out.println(simpleDateFormat.format(date));
        }
     }
}
