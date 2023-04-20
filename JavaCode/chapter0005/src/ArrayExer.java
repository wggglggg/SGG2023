/**
 * ClassName: ArrayExer
 * Description:
 *      举例 8：评委打分
 *      分析以下需求，并用代码实现：
 *      （1）在编程竞赛中，有 10 位评委为参赛的选手打分，分数分别为：
 *      5，4，6，8，9，0，1，2，7，3
 *      （2）求选手的最后得分（去掉一个最高分和一个最低分后其余 8 位评委打分的
 *      平均值）
 * @Author wggglggg
 * @Create 2023/3/13 10:11
 * @Version 1.0
 */
public class ArrayExer {
    public static void main(String[] args) {
        int[] scores = {5,4,6,8,9,0,1,2,7,3};
        // 用两个变量存放最高分与最低数，与总分
        int max = scores[0];
        int min = scores[0];
        int sum = 0;

        // 遍历找出最大与最小分数
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
            if (max < scores[i]) {
                max = scores[i];
            }
            if (min > scores[i]) {
                min = scores[i];
            }
            sum += scores[i];
        }
        // 平均得分 去掉最高与最低

        double avg = (double) (sum - max - min) / (scores.length - 2 );
        // 选手去掉最高分和最低分之后的平均分为: 4.5
        System.out.println("选手去掉最高分和最低分之后的平均分为: " + avg);
    }

}
