package com._this.exer1;

/**
 * ClassName: Boy
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/20 19:09
 * @Version 1.0
 */
public class Boy {

    private String name;
    private int age;

    public Boy () {

    }
    public Boy (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String i) {
        name = i;
    }
    public String getName(){
        return name;
    }

    public void setAge(int i) {
        age = i;
    }
    public int getAge(){
        return age;
    }

    public void marry(Girl girl) {
        if (this.age > 22 && girl.getAge() >20) {
            System.out.println(name + " and " + girl.getName() + " are getting married soon.");
        } else {
            System.out.println(name + " and " + girl.getName() + " are too young to get married.");
        }
    }

    public void shout() {
        if (this.age >= 22) {
            System.out.println("我可以结婚了");
        }else {
            System.out.println("还得多等几年！");
        }
    }
}
