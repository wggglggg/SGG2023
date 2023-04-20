package com.wggglgggtop;

/**
 * ClassName: ValueTransferTest1
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/17 15:40
 * @Version 1.0
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {
        ValueTransferTest1 test = new ValueTransferTest1();
        //1. 对于基本数据类型的变量来说
        int a = 10;
        // 由于要使用method1方法，必须要告诉main并创建出一个对象
        test.method1(a);
        // 打印的只是main当中的变量a，所以还是10
        System.out.println(a);  // 10

        //2. 对于引用数据类型的变量来说
        // 实例出一个Person类对象
        Person p = new Person();
        p.age = 10;

        // p 对象给了方法二， 那么方法二拿到的也是p对象的内存地址
        // 同一样内存地址，操作方法二时，就改动了p对象
        test.method2(p);
        System.out.println(p.age); //  11


    }

    // 方法一
    public void method1(int a) {
        a++;
    }
    // 方法二
    public void method2(Person p) {
        p.age++;
    }
}

class Person {
    int age;
}
