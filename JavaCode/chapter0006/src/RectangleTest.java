/**
 * ClassName: RectangleTest
 * Description:
 * *      练习 3：
 *  *          3.1 编写程序，声明一个 method 方法，在方法中打印一个 10*8 的*型矩形，在
 *  *          main 方法中调用该方法。
 *  *          3.2 修改上一个程序，在 method 方法中，除打印一个 10*8 的*型矩形外，再计
 *  *          算该矩形的面积，并将其作为方法返回值。在 main 方法中调用该方法，接收
 *  *          返回的面积值并打印。
 * @Author wggglggg
 * @Create 2023/3/15 19:45
 * @Version 1.0
 */
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.countArea();

        int area = rectangle.countArea(15, 9);
        System.out.println(area);
    }
}
