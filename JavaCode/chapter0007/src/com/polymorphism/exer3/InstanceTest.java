package com.polymorphism.exer3;

/**
 * ClassName: InstanceTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/27 10:30
 * @Version 1.0
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();

        test.method(new Student());
    }


    public void method(Person e) {
//        if (e instanceof Graduate) {
//            e.getInfo();
//            System.out.println("a graduated student");
//        } else if (e instanceof Student) {
//            e.getInfo();
//            System.out.println("a student");
//        } else {
//            e.getInfo();
//            System.out.println("a person");
//        }
        System.out.println(e.getInfo());
    }

}
