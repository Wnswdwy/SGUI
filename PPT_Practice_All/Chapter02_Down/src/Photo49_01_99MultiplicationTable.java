/**
 * @author yycstart
 * @create 2020-07-26 11:36
 * 打印 9 * 9 乘法表
 */
public class Photo49_01_99MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + j * i + "\t");
            }
            System.out.println();
        }
    }
}

