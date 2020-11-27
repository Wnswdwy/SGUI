package HomeWork04;

/**
 * @author yycstart
 * @create 2020-07-25 19:47
 *
 *      ----------
 *      1 2 3 4 5
 *      1 2 3 4 5
 *      1 2 3 4 5
 *      1 2 3 4 5
 *      1 2 3 4 5
 *      1 2 3 4 5
 *      ----------
 */
public class Test02_1_5Photo {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 9; i++) {
            System.out.print("-");
        }
    }
}
