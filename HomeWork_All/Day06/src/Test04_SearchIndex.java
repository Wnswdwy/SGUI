/**
 * @author yycstart
 * @create 2020-07-28 18:26
 *
 * 使用线性查找[-98, -76, -3, 0, 5, 6, 22, 34]，从上述数组中查找22是否存在。
 * 存在，返回所在位置的索引。不存在，输出提示信息。
 */
public class Test04_SearchIndex {
    public static void main(String[] args) {
        int[] arr = new int[]{-98, -76, -3, 0, 5, 6, 22, 34};
        int searchNumber = 22;
        boolean isExist = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == searchNumber){
                System.out.print("找到了，该元素在数组中的索引位置为："+ i);
                isExist = true;
            }
        }
        if(isExist == false){
            System.out.println("不好意思，数组中没有这个元素！");
        }

    }
}
