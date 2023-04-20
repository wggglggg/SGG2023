/**
 * ClassName: YangHuiTest
 * Description:
 * 案例 3：使用二维数组打印一个 10 行杨辉三角。
     * 提示：
     * 18. 第一行有 1 个元素, 第 n 行有 n 个元素
     * 19. 每一行的第一个元素和最后一个元素都是 1
     * 20. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
 * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 * @Author wggglggg
 * @Create 2023/3/13 9:24
 * @Version 1.0
 */
public class YangHuiTest {
    public static void main(String[] args) {
        // 初始化，首先知道有10行
        int[][] arr = new int[10][];

        // 再将数组模型造，也就是第一行1个，第二行2个，第三个3个元素
        // 通过arr[0] = new int[1] arr[1] = new int[2]方式来做
        /*
            1
            1	1
            1	0	1       arr[2][1] = arr[1][0] + arr[1][1]
            1	0	0	1
            1	0	0	0	1
            1	0	0	0	0	1
            1	0	0	0	0	0	1
            1	0	0	0	0	0	0	1
            1	0	0	0	0	0	0	0	1
            1	0	0	0	0	0	0	0	0	1

            1
            1	1
            1	2	1
            1	3	3	1
            1	4	6	4	1
            1	5	10	10	5	1
            1	6	15	20	15	6	1
            1	7	21	35	35	21	7	1
            1	8	28	56	70	56	28	8	1
            1	9	36	84	126	126	84	36	9	1
         */
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];

            // 每一行的第一个元素和最后一个元素都是 1
            arr[i][0] = arr[i][i] = 1;
            // 开始填充中心的数值
            // 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
            // yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
            for (int j = 1; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }

        // 打印YangHui模式
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
