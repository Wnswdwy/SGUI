import java.util.HashSet;
import java.util.Set;

/**
 * @author yycstart
 * @create 2020-08-12 15:33
 */
public class SetTest02 {
    public static void main(String[] args) {
        Set set = new HashSet();
        int i = 0;
        for(i= 0;i < 10; i++) {
            boolean istrue = set.add((int) (Math.random() * 20));
        }
        System.out.println(set);


    }
}
