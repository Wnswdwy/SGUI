/**
 * @author yycstart
 * @create 2020-08-11 11:52
 */
public class Test01 {
    public static void main(String[] args) {
        String string = "  abcQYz12 我喜欢你,你喜欢我吗? 我不喜欢你, zzQQyy  ";
        String string2 = "";
        System.out.println(string);
        // 反向遍历字符串, 把字符串接在string2后面, 循环结束就OK.
        for(int i = string.length()-1; i > 0;i--){
            string2 += string.charAt(i);
        }
        System.out.println(string2);
    }
}
