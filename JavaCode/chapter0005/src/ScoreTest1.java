import java.util.Scanner;

/**
 * ClassName: ScoreTest1
 * Description:
 *   案例 3：从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 *      • 成绩>=最高分-10 等级为’A’
 *      • 成绩>=最高分-20 等级为’B’
 *      • 成绩>=最高分-30 等级为’C’
 *      • 其余 等级为’D’
 * 提示：先读入学生人数，根据人数创建 int 数组，存放学生成绩。
 *
 * @Author wggglggg
 * @Create 2023/3/11 11:58
 * @Version 1.0
 */
public class ScoreTest1 {

    public static void main(String[] args) {
        System.out.print("请输入学生人数：");
        Scanner input = new Scanner(System.in);
        //获取学生人数
        int studentsNumber = input.nextInt();
        
        // 学生分数数组
        int[] scores = new int[studentsNumber];
        
        // 最高学生分数,默认放第一个成绩，随后去比较
        int maxScore = scores[0];
        
        // 学生等级
        char grade;
        
//        System.out.print("请依次输入" + studentsNumber + "位学生成绩");
        for (int i = 0; i < studentsNumber; i++) {
            System.out.print("请依次输入" + studentsNumber + "位学生成绩");
            scores[i] = input.nextInt();           
            
            // 比较成绩
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }
        System.out.println("最高分数是：" + maxScore);
        
        // 给每个数定义等级
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= maxScore - 10) {
                grade = 'A';
            } else if (scores[i] >= maxScore - 20) {
                grade = 'B';
            } else if (scores[i] >= maxScore - 30) {
                grade = 'C';
            } else {
                grade = 'D';
            }
            // 打印出每位学生的成绩等级
            System.out.println("student" + i + "score is " + scores[i] +
                    ", grade is :" + grade);
        }
        
        
        
        
    }
}
