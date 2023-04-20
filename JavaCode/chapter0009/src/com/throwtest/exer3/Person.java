package com.throwtest.exer3;

/**
 * ClassName: Person
 * Description:
 *      （2）定义Person类
 * ①属性：名称(name)和生命值(lifeValue)
 * ②提供setter和getter方法：
 * 在setLifeValue(int lifeValue)方法中，首先判断，如果 lifeValue为负数,就抛出NoLifeValueException，
 * 异常信息为：生命值不能为负数：xx；
 * 然后再给成员lifeValue赋值。
 * @Author wggglggg
 * @Create 2023/4/6 19:22
 * @Version 1.0
 */
public class Person {
    private String name;    // 名称
    private int lifeValue;  //生命值

    public Person() {
    }

    public Person(String name, int lifeValue) {
        setName(name);
        setLifeValue(lifeValue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {

        if (lifeValue < 0) {
            throw new NoLifeValueException("生命值不能为负数：" + lifeValue);

        }

        this.lifeValue = lifeValue;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lifeValue=" + lifeValue +
                '}';
    }
}
