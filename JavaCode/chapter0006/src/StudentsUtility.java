/**
 * ClassName: StudentsUtility
 * Description:
 *  定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 * @Author wggglggg
 * @Create 2023/3/16 16:02
 * @Version 1.0
 */
public class StudentsUtility {
    /**
     * 查询指定年级(state)的学生信息
     * @param students  一个学生数组
     * @param state     查询年级
     */
    public void Info(Students[] students, int state) {

        for (int i = 0; i < students.length; i++) {
            if (state == students[i].state) {
//                Students stu = students[i];
                System.out.println(students[i].getInfo());;
            }
        }
    }

    /**
     * 遍历指定的学生数组
     * @param students 一个学生数组
     */
    public void printAllStudents(Students[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getInfo());
        }
    }

    /**
     * 使用冒泡排序按学生成绩排序
     * @param students  数组内的元素是Students实例化对象
     */
    public void sortScores(Students[] students) {

        for (int i = 1; i < students.length; i++) {
            boolean isFlag = true;
            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].score > students[j + 1].score) {
                    Students temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    isFlag = false;
                }
            }
            if (isFlag) {
                break;
            }
        }
    }

    /**
     * 使用冒泡排序按学生成绩排序,可以选择asc正序与desc倒序
     * @param students  students类数组
     * @param sortOption asc正序 desc倒序
     */
    public void sortScores(Students[] students, String sortOption) {
        if ("asc".equals(sortOption)) {
            for (int i = 1; i < students.length; i++) {
                boolean isFlag = true;
                for (int j = 0; j < students.length - 1; j++) {
                    if (students[j].score > students[j + 1].score) {
                        Students temp = students[j];
                        students[j] = students[j + 1];
                        students[j + 1] = temp;
                        isFlag = false;
                    }
                }
                if (isFlag) {
                    break;
                }
            }
        } else if("desc".equals(sortOption)) {
            for (int i = 1; i < students.length; i++) {
                boolean isFlag = true;
                for (int j = 0; j < students.length - 1; j++) {
                    if (students[j].score < students[j + 1].score) {
                        Students temp = students[j];
                        students[j] = students[j + 1];
                        students[j + 1] = temp;
                        isFlag = false;
                    }
                }
                if (isFlag) {
                    break;
                }
            }
        } else {
            System.out.println("请输入 asc正序 或者 desc倒序");
        }

    }

}
