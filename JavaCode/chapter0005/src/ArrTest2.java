/**
 * ClassName: ArrTest2
 * Description:
 * 数组的缩容
 *      题目：现有数组 int[] arr={1,2,3,4,5,6,7}。现需删除数组中索引为 4 的元素。
 * @Author wggglggg
 * @Create 2023/3/13 13:47
 * @Version 1.0
 */
public class ArrTest2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        // 用一个变量存放下标
        int delIndex = 4;

        // arr[i+1] 数组最后一个时,会出现arr[8]的下标,所以for条件判断时,循环到6就好
        for (int i = delIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        // 最后一位用0来填充,进行手动填充,不然会出现1,2,3,4,6,7,7
        arr[arr.length - 1] = 0;
        // 遍历出数组  1,2,3,4,6,7,0,
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
