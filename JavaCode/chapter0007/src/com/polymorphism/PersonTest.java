package com.polymorphism;

/**
 * ClassName: PersonTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/26 19:13
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();

        System.out.println(p1.getClass());  // class com.polymorphism.Person


        p1.drink();         // Person在喝酒

        drink(new Man());       // Man在喝酒
        drink(new Woman());     // Woman在喝酒

        Person p2 = new Man();
        System.out.println(p2.getClass());
        Man m1 = (Man) p2;  // 强转成Man
        p2.eat();       // Man多吃肉,长肌肉

        System.out.println((m1 instanceof Man));    // true
        System.out.println(p2 instanceof Man);      // true
        System.out.println(p2 instanceof Person);   // true
        System.out.println(p2.getClass());          // class com.polymorphism.Man
        System.out.println(m1.getClass());          // class com.polymorphism.Man

        Woman w1 = new Woman();
        Person p20 = (Person) w1;
        System.out.println(p20.getClass());


    }

    public static void drink (Person person) {
        person.drink();
    }


}
