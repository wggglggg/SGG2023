package com.field.exer;

/**
 * ClassName: Mid
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/29 19:55
 * @Version 1.0
 */
public class Mid extends Root{
    static{
        System.out.println("Mid的静态初始化块");
    }
    {
        System.out.println("Mid的普通初始化块");
    }

    public Mid() {
        super("wggglggg");
        System.out.println("Mid的无参数的构造器");
    }
    public Mid(String msg) {
        this();
        System.out.println("Mid的带参数构造器，其参数值："
                + msg);
    }
}
