import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author yycstart
 * @create 2020-08-12 16:00
 */
public class ListTest01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        while (list.size() != 10){
            list.add((int)(Math.random()*20));
        }
        System.out.println(list);
    }
}
