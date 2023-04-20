package com._super;

/**
 * ClassName: Son
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/25 16:35
 * @Version 1.0
 */
class Son extends Father{
    private String info = "尚硅谷";
    public void test(){
        System.out.println(this.getInfo());
        System.out.println(super.getInfo());
    }

//    public String getInfo(){
//        return info;
//    }
}
