/**
 * ClassName: TestArrayOrderSearch
 * Description:
 *  1、顺序查找
 *  顺序查找：挨个查看
 *  要求：对数组元素的顺序没要求
 * @Author wggglggg
 * @Create 2023/3/13 14:39
 * @Version 1.0
 */
public class TestArrayOrderSearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,9};
        int target = 1;
        int index = -1; // 默认给一个-1的下标

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        // 判断查询结果
        if (index == -1) {
            System.out.println("没找到");
        }else {
            System.out.println("找到了," + target + "下标为:" + index);
        }
    }
}
