package com.polymorphism.exer3;

/**
 * ClassName: Graduate
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/27 10:30
 * @Version 1.0
 */
class Graduate extends Student{
    public String major="IT";
    public String getInfo()
    {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}