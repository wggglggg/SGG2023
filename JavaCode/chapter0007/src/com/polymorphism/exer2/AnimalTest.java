package com.polymorphism.exer2;

/**
 * ClassName: AnimalTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/27 9:44
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        adopt(new Dog());
        adopt(new Cat());
    }

    public static void adopt(Animal a) {
        // 如果传入是狗，就强转成 Dog类
        if (a instanceof Dog) {
            Dog dog = (Dog) a;
            dog.watchDoor();
        }
        // 如果传入是猫，就强转成 Cat类
        if(a instanceof Cat) {
            Cat cat = (Cat) a;
            cat.catchMouse();
        }
    }

}
