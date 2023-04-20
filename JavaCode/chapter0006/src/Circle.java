/**
 * ClassName: Circle
 * Description:
 *      练习 2：利用面向对象的编程方法，设计圆类 Circle，包含属性（半径）和计算
 *   圆面积的方法。定义测试类，创建该 Circle 类的对象，并进行测试。
 * @Author wggglggg
 * @Create 2023/3/15 19:20
 * @Version 1.0
 */
public class Circle {

    // 定义圆半径属性
    double radius;

    /**
     * 计算圆面积
     * @return 返回圆面积
     */
    public double countArea () {
        return 3.14 * radius * radius;
    }
}
