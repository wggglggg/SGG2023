/**
 * ClassName: Students
 * Description:
 *  创建20个学生对象， 学号为1到20， 年级与成绩由随机数确定
 *  问题一: 打印出3年级（state值为 3）的学生信息
 *  问题二： 使用冒泡排序按学生成绩排序， 并遍历所有学生的成绩
 * @Author wggglggg
 * @Create 2023/3/16 10:00
 * @Version 1.0
 */
public class Students {

     int studentID;      // 学生ID
     int state;          // 年级
     double score;       // 成绩


     /**
      * 查询学生的信息
      * @return 学生的信息
      */
     public String getInfo() {

          return  "学生ID：" + studentID +
                  "\t学生年级：" + state +
                  "\t学生成绩：" + score;
     }
}
