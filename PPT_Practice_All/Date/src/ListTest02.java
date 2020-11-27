import java.util.ArrayList;
import java.util.List;

/**
 * @author yycstart
 * @create 2020-08-12 16:05
 */
public class ListTest02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        int num = 0;
        while (list.size() != 10){
            int rand = (int)(Math.random()*20);
            if(!list.contains(rand)){
                list.add(rand);
            }
        }
        System.out.println(list);
    }
}
