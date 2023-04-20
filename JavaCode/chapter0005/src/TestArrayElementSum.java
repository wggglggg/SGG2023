/**
 * ClassName: TestArrayElementSum
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/12 19:43
 * @Version 1.0
 */
public class TestArrayElementSum {
    public static void main(String[] args) {

        // 举例 1：数组统计：求总和、均值
        int[] arr = {4,5,6,1,9};
        // 求和
        int sum = 0;
        // 求平均值
        double avg = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = (double) sum / arr.length;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);

        System.out.println("--------------------------------------");

        // 举例 2：求数组元素的总乘积
        int[] arr2 = {4,5,6,1,9};
        long result = 1;    //因为 1 乘以任何数都不影响结果

        for (int i = 0; i < arr.length; i++) {
            result *= arr2[i];
        }
        System.out.println("result = " + result);
    }
}
