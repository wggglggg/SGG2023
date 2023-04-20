/**
 * ClassName: StudentsTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/16 10:01
 * @Version 1.0
 */
public class StudentsTest {
    public static void main(String[] args) {
        // 先生成一个学校学生的数组，用于存放许多学生对象
        Students[] students = new Students[20];

        // 创建20个学生对象， 学号为1到20， 年级与成绩由随机数确定
        for (int i = 0; i < students.length; i++) {
            students[i] = new Students();
            students[i].score = (int) (Math.random() * 101);            // 随机分配分数，0-100
            students[i].studentID = i + 1;                      // 顺序分配年级
            students[i].state = (int) (Math.random() * 6 + 1);    // 随机分配年级，1-6

        }

        //需求1：打印出3年级(state值为3）的学生信息
        // 生成一个工具对象
        StudentsUtility utility = new StudentsUtility();
        utility.Info(students, 3);
        // 分隔线
        System.out.println("`````````````````````````````````````");


        //需求2：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        //排序前遍历
        utility.printAllStudents(students);

        //排序后遍历
        utility.sortScores(students, "asc");
        System.out.println("`````````````````````````````````````");
        utility.printAllStudents(students);

    }
}
