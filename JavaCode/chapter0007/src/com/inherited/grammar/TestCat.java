package com.inherited.grammar;

/**
 * ClassName: TestCat
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/25 9:18
 * @Version 1.0
 */
public class TestCat {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "Tom";
        cat.age = 2;
        cat.eat();
        cat.catchMouse();
        cat.catchMouse();
        cat.catchMouse();
        System.out.println(cat.getClass().getSuperclass());
    }
}
