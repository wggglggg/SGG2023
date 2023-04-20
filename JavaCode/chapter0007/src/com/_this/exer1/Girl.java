package com._this.exer1;

/**
 * ClassName: Girl
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/20 19:13
 * @Version 1.0
 */
public class Girl {

    private String name;
    private int age;

    public Girl() {

    }
    public Girl(String name, int age) {
        this(); // 如果想继承上面的初始化，也可以写这句
        this.name = name;
        this.age = age;
    }
    public void setName(String i){
        name = i;
    }
    public String getName(){
        return name;
    }

    public int getAge(){ return age;}

    public void marry (Boy boy) {
        System.out.println(name + " and " + boy.getName() + "are getting married soon.");
        boy.marry(this);
    }

    public int compare(Girl girl){
        if (this.age > girl.age) {
            System.out.println(this.name + " 的年龄比 " + girl.name + " 大 ");
            return 1;
        } else if (this.age < girl.age) {
            System.out.println(this.name + " 的年龄比 " + girl.name + " 小 ");
            return -1;
        }else {
            System.out.println(this.name + " 与 " + girl.name + " 年龄一样大");
            return 0;
        }

    }
}
