/**
 * ClassName: Test25DifferentElementCount
 * Description:
 * 练习：
 * /*
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 *
 * @Author wggglggg
 * @Create 2023/3/12 11:03
 * @Version 1.0
 */
public class Test25DifferentElementCount {
    public static void main(String[] args) {
        //1、声明一个二维数组，并且确定行数
        //因为每一行的列数不同，这里无法直接确定列数
        int[][] arr = new int[5][];

        // 设定每一行有多少列，例如第一行只有一列，第五行有五列
        // arr[0] = new int[1];
        // arr[1] = new int[2];
        // arr[2] = new int[3];
        // arr[3] = new int[4];
        // arr[4] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i+1];
        }
        // 生成列
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
            }
        }

        // 打印出二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
