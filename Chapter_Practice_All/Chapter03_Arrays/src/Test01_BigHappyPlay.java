/**
 * @author yycstart
 * @create 2020-07-27 19:54
 *
 * 一组大乐透号码由10个1-99之间的数字组成
 * 打印大乐透号码信息
 */
public class Test01_BigHappyPlay {
    public static void main(String[] args) {
        int[] number = new int[10];
        System.out.print("大乐透号码信息为：\t");
        for (int i = 0; i < 10; i++) {
            number[i] = (int)(Math.random() * 90 + 10 );
            System.out.print(number[i] + " ");
        }
    }
}
