/**
 * ClassName: CircleTest
 * Description:
 *          练习 2：利用面向对象的编程方法，设计圆类 Circle，包含属性（半径）和计算
 *  *   圆面积的方法。定义测试类，创建该 Circle 类的对象，并进行测试。
 * @Author wggglggg
 * @Create 2023/3/15 19:34
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        // 定义圆对象
        Circle circle = new Circle();

        // 圆半径值
        circle.radius = 7.5;
        // 计算出圆面积，调用countArea方法
        double area = circle.countArea();
        System.out.println("圆半径为 " + circle.radius + " 米，面积为 " + area);
    }
}
