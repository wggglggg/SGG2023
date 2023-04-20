package com.constructor.exer1;

/**
 * ClassName: StudentTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/20 14:54
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student("葱油饼", 22);
        Student s2 = new Student("Haier", "海尔交通大学");
        Student s3 = new Student("Hisenses", 20, "扬州技工学校", "加工中心");

        s1.getInfo();
        s2.getInfo();
        s3.getInfo();

    }
}
