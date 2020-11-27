import java.util.HashSet;
import java.util.Set;

/**
 * @author yycstart
 * @create 2020-08-12 15:23
 */
public class SetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        int i = 0;
        for(i= 0;i < 10; i++){
            if(!set.add((int)(Math.random()*20))){
                i--;
            }
        }
        System.out.print(set);
    }
}
