/**
 * ClassName: ArrayTest
 * Description:
 * *      案例：
 *  *      根据上一章数组中的常用算法操作，自定义一个操作int[]的工具类。
 *  *      涉及到的方法有：求最大值、最小值、总和、平均数、遍历数组、复制数组、
 *  *              数组反转、数组排序(默认从小到大排序)、查找等
 * @Author wggglggg
 * @Create 2023/3/15 20:06
 * @Version 1.0
 */
public class ArrayTest {

    public static void main(String[] args) {
        int[] arr = new int[] {3,65,2,1,32};
//        int[] arr = new int[]{1,2,3,32,65};
        ArrayTools arrayTools = new ArrayTools();

//        arrayTools.sortArray(arr, "asc");
        arrayTools.sortArray(arr, "desc");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]  + ",");
        }
        System.out.println();
//        System.out.println(arrayTools.getSum(arr));
//        System.out.println(arrayTools.getAvg(arr));
        System.out.println(arrayTools.searchArray(arr, 6)); // 6不在数组中，所以返回-1

    }

}
