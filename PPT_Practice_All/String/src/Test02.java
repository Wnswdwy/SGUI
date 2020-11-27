/**
 * @author yycstart
 * @create 2020-08-11 14:34
 */
public class Test02 {
    public static void main(String[] args) {
        /*获取一个字符串在另一个字符串中出现的次数。
比如：获取"ab"在 "abkkcadkabkebfkabkskab"中出现的次数  cadkabkebfkabkskab*/
            String s1 = "abkkcadkabkebfkabkskab";
            String s2 = "abk";
            int count = 0;
            int index = 0;
            boolean istrue = true;
            int n = 0;
            while (istrue) {
                 n = s1.indexOf(s2,index);
                if (n == -1) {
                    istrue = false;
                }else {
                    count++;
                    index = n + 1;
                }
            }
        System.out.println(count);
        }
    }

