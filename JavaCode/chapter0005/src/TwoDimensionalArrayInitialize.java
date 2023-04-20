/**
 * ClassName: TwoDimensionalArrayInitialize
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/12 10:50
 * @Version 1.0
 */
public class TwoDimensionalArrayInitialize {
    public static void main(String[] args) {
        //存储多组成绩
        int[][] grades = {
                {89,75,99,100},
                {88,96,78,63,100,86},
                {56,63,58},
                {99,66,77,88}
        };

        System.out.println("最好成绩是: " + grades[0][3]);
        System.out.println("最差成绩是: " + grades[1][3]);
        //存储多组姓名
        String[][] names = {
                {"张三","李四", "王五", "赵六"},
                {"刘备","关羽","张飞","诸葛亮","赵云","马超"},
                {"曹丕","曹植","曹冲"},
                {"孙权","周瑜","鲁肃","黄盖"}
        };
        System.out.println("桃园结义三兄弟是: " +
                names[1][0] + names[1][1] + names[1][2]);


    }
}
