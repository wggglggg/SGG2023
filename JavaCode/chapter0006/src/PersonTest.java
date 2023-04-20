/**
 * ClassName: PersonTest
 * Description:
 * (1)创建 Person 类的对象，设置该对象的 name、age 和 sex 属性，调用 study
 *  * 方法，输出字符串“studying”，调用 showAge()方法显示 age 值，调用 addAge()
 *  * 方法给对象的 age 属性值增加 2 岁。
 *  *
 *  (2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
 * @Author wggglggg
 * @Create 2023/3/15 15:50
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        // 实例化对象
        Person jack = new Person();
        // 给jack上属性
        jack.name = "Jack";
        jack.age = 20;
        jack.gender = 'M';

        jack.study();
        System.out.println(jack.showAge());
        jack.addAge(3); // 加上3岁
        System.out.println(jack.showAge());

        Person rose = new Person();

        rose.name = "rose";
        rose.age = 21;
        rose.gender = 'F';

        System.out.println(rose.showAge());;
    }
}
