package com.grammar._07record;

/**
 * ClassName: Person
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/5/8 19:50
 * @Version 1.0
 */
public record Person(int id, String name) {
    //- 还可以在record声明的类中定义静态字段、静态方法、构造器或实例方法。
    static String info = "5月8日为周一";

    public static void show(){
        System.out.println("5月8日多云");
    }

    public Person() {
        this(0,null);
    }

    public void eat( ){
        System.out.println("行疆无界");
    }

    //- 不能在record声明的类中定义实例字段；类不能声明为abstract；不能声明显式的父类等。
    //    final int age;


//abstract record Dog(int id){}

//record Cat(int id) extends Thread{}

//class Student extends Person{}
}
