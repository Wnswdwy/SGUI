import javax.sound.midi.Soundbank;

/**
 * @author yycstart
 * @create 2020-07-28 14:03
 *
 * 1. 第一行有 1 个元素, 第 n 行有 n 个元素
 *  2. 每一行的第一个元素和最后一个元素都是 1
 *  3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
 * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 */
public class Photo49_YangHuiTriangle {
    public static void main(String[] args) {
        int[][] yanghui = new int[11][];
        for (int i = 0; i < yanghui.length; i++){
            yanghui[i] = new int [i+1];
        }
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i][0] = yanghui[i][i] = 1;
            for (int j = 1; j < yanghui[i].length-1; j++) {
                yanghui[i][j] = yanghui[i][j -1] + yanghui[i-1][j-1];
            }


        }
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + " ");
            }
            System.out.println();
        }
    }
}
