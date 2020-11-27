import javax.sound.midi.Soundbank;

/**
 * @author yycstart
 * @create 2020-07-30 16:23
 */
public class Photo96_MianShi {
    public static void main(String[] args) {
        Test96 tes = new Test96();
        tes.B();

    }
}

class Test96{
    public void  B(){
        R(10);
        System.out.println(count);
    }
    int count = 0;
    public int R(int k){
        count++;
        System.out.println("count1:"+ count +
                " k:" + k);
        if(k <= 0){
            return 0;
        }
        return R(k -1) + R(k - 2);
    }
}