import com.sun.org.apache.xpath.internal.operations.Lt;

/**
 * @author yycstart
 * @create 2020-07-27 21:14
 *
 * 字符数组：{'a','l','f','m','f','o','b','b','s','n'}
 * 统计每个字符出现的次数并打印到控制台。
 */


public class Test04_SumNumberSum {
    public static void main(String[] args) {
        char[] letter = {'a','l','f','m','f','o','b','b','s','n'};
        char[] onlyLetter = new char[letter.length];
        for (int i = 0; i < letter.length; i ++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                onlyLetter[i] = letter[j];
                if(onlyLetter[i] == letter[i+j]) {
                    sum++;
                }
                System.out.println(onlyLetter[i] + "--" + sum);
            }

        }
    }
}
