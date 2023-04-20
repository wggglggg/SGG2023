/**
 * ClassName: Test19BubbleSort
 * Description:
 *      冒泡排序（最经典）
 *      思想：每一次比较“相邻（位置相邻）”元素，如果它们不符合目标顺序（例如：从小
 *      到大），就交换它们，经过多轮比较，最终实现排序。
 *      （例如：从小到大） 每一轮可以把最大的沉底，或最小的冒顶。
 * @Author wggglggg
 * @Create 2023/3/13 16:53
 * @Version 1.0
 */
public class Test19BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6,9,2,9,1}; // 6 2 9 1 9


        // 外部循环控制多少轮
        for (int i = 1; i < arr.length; i++) {
            // 内部循环控制 某一个数值与其它数值对比的次数
            // 第一个最大值得出后放到数组最后面,在得出第二个最大数时,就不用于第一个最大值对比了
            // 这也就是为什么arr.length 还要再 - i,
            for (int j = 0; j < arr.length - i; j++) {
                // 比较前后两个数值大小,并将最大的放后面
                if (arr[j] > arr[j+1]) {
                    // 开始交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }


            }
            // 测试查看每一轮滚动的结果
            /*
            6,9,2,9,1   // 初始
            ---------
            6,2,9,1,9,
            2,6,1,9,9,
            2,1,6,9,9,
            1,2,6,9,9,
             */
            for (int k = 0; k < arr.length; k++) {
                System.out.print( arr[k] + ",");
            }
            System.out.println();
        }

        // 遍历出排序后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
