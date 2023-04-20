/**
 * ClassName: MyDateTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/15 19:54
 * @Version 1.0
 */
public class MyDateTest {
    public static void main(String[] args) {
        MyDate me = new MyDate();
        MyDate she = new MyDate();

        me.year = 1939;
        me.month = 3;
        me.day = 21;

        she.year = 1945;
        she.month = 9;
        she.day = 4;

        me.showBirthday();
        she.showBirthday();
    }

}
