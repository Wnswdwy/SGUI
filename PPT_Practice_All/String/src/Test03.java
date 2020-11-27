import org.junit.Test;

/**
 * @author yycstart
 * @create 2020-08-11 15:23
 * //将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”
 * @Test
 * public void exer3() {
 *     String string = "abcdefghijklmn";
 *     int begin = 2;
 *     int end = 8;
 *     String s1 =
 *     String s2 = substring(begin, end);
 *     String s3 =
 *
 * }
 */
public class Test03 {

    public static void main(String[] args) {
        String string = "abcdefghijklmn";
        int begin = 2;
        int end = 8;
        String s1 = string.substring(0,begin);
        String s2 = string.substring(begin, end);
        String s3 = string.substring(end);
        System.out.println(string);
        char[] a = new char[s2.length()];
        for (int i = 0; i < s2.length();i++){
            a[i] = string.charAt(s2.length()-i + 1);
        }
        String s4 = "";
        for (int i = 0; i < a.length; i++) {
            s4 += a[i];
        }
        System.out.println(s1 + s4 + s3);
    }
}
