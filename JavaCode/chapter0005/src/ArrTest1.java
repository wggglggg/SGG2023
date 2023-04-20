/**
 * ClassName: ArrTest1
 * Description:
 *    数组的扩容
 *      题目：现有数组 int[] arr = new int[]{1,2,3,4,5}; ，现将数组长度扩容 1 倍，并将
 *      10,20,30 三个数据添加到 arr 数组中，如何操作？
 * @Author wggglggg
 * @Create 2023/3/13 13:26
 * @Version 1.0
 */
public class ArrTest1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        // 先生成一个新的数组作临时中转
        // 二进制中左边一位是右边一位的2倍，所以<< 来表示 *2
        int[] newArr = new int[arr.length << 1];
        // 再将老数组中的数据一个一个填充到新数组中
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        // 按题目要求还要存放到arr,也就是要将新数组与老数组变量进行挂钩
        // 也就是将新数组的内存地址赋给老变量
        newArr[arr.length] = 10;
        newArr[arr.length + 1] = 20;
        newArr[arr.length + 2] = 30;
        arr = newArr;


        // 遍历数组打印  {1,2,3,4,5,10,20,30,0,0}
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
