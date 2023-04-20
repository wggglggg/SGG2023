/**
 * ClassName: SumArray
 * Description:
 * 案例 1：获取 arr 数组中所有元素的和。
 * 提示：使用 for 的嵌套循环即可
 * 3 5 8
 * 12 9
 * 7 0 6 4
 * @Author wggglggg
 * @Create 2023/3/12 19:29
 * @Version 1.0
 */
public class SumArray {
    public static void main(String[] args) {
        // 申明数组
        int arr [][] = new int[][] {{3 ,5, 8},{12, 9},{7, 0, 6, 4}};
        // 定义一个变量存放所有元素的和
        int sum = 0;

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("arr 数组中所有元素的和: " + sum);
    }
}
