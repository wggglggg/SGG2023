package com.field.exer;

/**
 * ClassName: Root
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/29 19:54
 * @Version 1.0
 */
public class Root {
    static {
        System.out.println("Root的静态初始化块");
    }
    {
        System.out.println("Root的普通初始化块");
    }

    public Root() {
        super();
        System.out.println("Root的无参数的构造器");
    }
    public Root(String msg) {
        System.out.println("Root的有参数的构造器" + msg);
    }
}
