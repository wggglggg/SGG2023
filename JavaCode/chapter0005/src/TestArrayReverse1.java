/**
 * ClassName: TestArrayReverse1
 * Description:
 *      6.3 数组元素的反转
 *      实现思想：数组对称位置的元素互换。
 *      int[] arr = {1,2,3,4,5} ----> int[] arr = {5,4,3,2,1};
 *
 * @Author wggglggg
 * @Create 2023/3/13 10:32
 * @Version 1.0
 */
public class TestArrayReverse1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(" 反转之前：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        // 方法一 反转
        for (int i = 0; i < arr.length/2; i++) {
            // 开始反转，先用一个临时变量来存放arr[0]
            int tem = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tem;
        }
        // 遍历打印出反转后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", \t");
        }

        // 方法二 直接把最前面与最后各给一个变量来保存索引标
        for (int i = 0, j = arr.length-1; i < j; i++, j-- ) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println();
        // 又将方法一 返回成初始值
        // 1	2	3	4	5
        // 5,   4, 	3, 	2, 	1,
        // 1, 	2, 	3, 	4, 	5,
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", \t");
        }
    }
}
