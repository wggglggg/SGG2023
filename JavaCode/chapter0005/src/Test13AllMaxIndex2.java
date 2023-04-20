/**
 * ClassName: Test13AllMaxIndex2
 * Description:
 *      举例 6：找最值及其所有最值的下标
 *      int[] arr = {4,5,6,1,9,9,3};
 * @Author wggglggg
 * @Create 2023/3/13 10:00
 * @Version 1.0
 */
public class Test13AllMaxIndex2 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,9,9,3};
        // 变量来存放最大值 与 下标信息
        int max = arr[0];
        String index = "0";
        // 找最大值及其所有最大值的下标，
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i + "";
            } else if (arr[i] == max) {
                index += ", " + i;
            }
        }
        // 最大值是9
        // 最大值的下标是4, 5
        System.out.println("最大值是" + max);
        System.out.println("最大值的下标是" + index);
    }
}
