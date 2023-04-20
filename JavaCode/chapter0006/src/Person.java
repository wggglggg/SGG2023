/**
 * ClassName: Person
 * Description:
 * (1)创建 Person 类的对象，设置该对象的 name、age 和 sex 属性，调用 study
 * 方法，输出字符串“studying”，调用 showAge()方法显示 age 值，调用 addAge()
 * 方法给对象的 age 属性值增加 2 岁。
 *
 * (2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
 * @Author wggglggg
 * @Create 2023/3/15 15:45
 * @Version 1.0
 */
public class Person {
    String name;
    int age;
    char gender;

    public void study () {
        System.out.println("studying");
    }

    public int showAge () {
        return age;
    }

    public void addAge (int addAge) {
        age += addAge;
    }
}
