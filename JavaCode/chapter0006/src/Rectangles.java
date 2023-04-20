/**
 * ClassName: Retangles
 * Description:
 *      1）定义矩形类 Rectangle，包含长、宽属性，area()返回矩形面积的方法，
 * perimeter()返回矩形周长的方法，String getInfo()返回圆对象的详细信息（如：
 * 长、宽、面积、周长等数据）的方法
 * @Author wggglggg
 * @Create 2023/3/16 9:05
 * @Version 1.0
 */
public class Rectangles {

    //属性 包含长、宽属性
    double length;
    double width;

    /**
     * 矩形面积的方法
     * @return 返回矩形面积
     */
    public double area() {
        return length * width;
    }

    /**
     * 返回矩形周长的方法
     * @return 返回矩形周长
     */
    public double perimeter() {
        return (length + width) * 2;
    }

    /**
     * 返回圆对象的详细信息（如： 长、宽、面积、周长等数据）的方法
     * @return 返回圆对象的详细信息
     */
    public String getInfo() {
        return  "长：" + length +
                ", 宽：" + width +
                ", 面积为：" + area() +
                ", 周长为：" + perimeter();
    }
}
