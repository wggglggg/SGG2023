import java.util.Arrays;

/**
 * ClassName: Test19BubbleSort2
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/14 16:18
 * @Version 1.0
 */
public class Test19BubbleSort2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 9};



        for (int i = 1; i < arr.length; i++) {
            // 如果数组一轮后已经是有序数组就直接break
            boolean isFlag = true;
            for (int j = 0; j < arr.length - i; j++) {
                // 与右边比较大小，大的往右移动
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // 只要发生过交换，就说明顺序混乱
                    isFlag = false;
                }
            }
            System.out.println("轮次：" + i);
            System.out.println(Arrays.toString(arr));

            if (isFlag) {
                // 发现数组有序，直接break弹出 结束
                break;
            }

        }
//        System.out.println(Arrays.toString(arr));
    }
}
