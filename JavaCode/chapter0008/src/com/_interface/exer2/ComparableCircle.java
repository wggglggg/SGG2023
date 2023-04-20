package com._interface.exer2;

/**
 * ClassName: ComparableCircle
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/30 14:50
 * @Version 1.0
 */
public class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle() {}
    public ComparableCircle(double radius) {
        super(radius);
    }

    /**
     * 比较内径大小
     * @param o ComparableCircle类
     * @return  0 相等, 1 前面大, -1 后面大, 2 不是同一个类,无法比较
     */
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o instanceof ComparableCircle) {
            ComparableCircle cc = (ComparableCircle) o;
            // 系统自带compare
            return Double.compare(this.getRadius(), cc.getRadius());
        } else {    // 不同类,无法比较
            return 2;
        }
    }
}
