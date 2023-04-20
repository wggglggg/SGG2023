package com.field.exer;

/**
 * ClassName: Leaf
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/29 19:57
 * @Version 1.0
 */
public class Leaf extends Mid{
    static{
        System.out.println("Leaf的静态初始化块");
    }
    {
        System.out.println("Leaf的普通初始化块");
    }

    public Leaf() {
        super("尚硅谷");
//        super();
        System.out.println("Leaf的构造器");
    }
}
