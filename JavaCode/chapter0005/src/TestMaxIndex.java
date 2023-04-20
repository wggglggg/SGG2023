/**
 * ClassName: TestMaxIndex
 * Description:
 *      举例 5：找最值及其第一次出现的下标
 * @Author wggglggg
 * @Create 2023/3/13 9:48
 * @Version 1.0
 */
public class TestMaxIndex {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,9,17,32,54};
        // 存放最大值 与 下标值
        int max = arr[0];
        int index = 0;

        // 找最值及其第一次出现的下标
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        //  最大值为：54
        //  下标为：7
        System.out.println("最大值为：" + max);
        System.out.println("下标为：" + index);
    }
}
