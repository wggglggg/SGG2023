/**
 * ClassName: TestArrayOrderSearch2
 * Description:
 *      二分法查找：要求此数组必须是有序的。
 *      int[] arr3 = new int[]{-99,-54,-2,0,2,33,43,256,999};
 * @Author wggglggg
 * @Create 2023/3/13 14:48
 * @Version 1.0
 */
public class TestArrayOrderSearch2 {
    public static void main(String[] args) {
        int[] arr3 = new int[]{-99, -54, -2, 0, 2, 33, 43, 256,999};
        int value = 256;        // 要查找的值
        value = 25;        // 要查找的值

        // 定义首索引与尾索引,另外将查询范围/2 得出中间指针
        int head = 0;
        int end = arr3.length - 1;
        //旗杆 默认是false未到找
        boolean isFlag = false;

        // 使用while来查找
        while(head < end) {
            // 定义中间指针
            // int middle = arr3.length / 2; // 这样写查询范围是不对的,范围被写死
            int middle = (end + head) / 2;
            if (arr3[middle] == value) {
                System.out.print("找到指定的元素，索引为：" + middle);
                isFlag = true;  // 改为true 找到了
                break;
            } else if (arr3[middle] > value) {
                end = middle - 1;
            } else {  // middle < value
                head = middle + 1;
            }
        }
        if (!isFlag) {
            System.out.println("未找打指定的元素");
        }
    }
}
