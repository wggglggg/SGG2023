package com._interface.exer2;

/**
 * ClassName: ComparableRectangle
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/30 15:14
 * @Version 1.0
 */
public class ComparableRectangle extends Rectangle implements CompareObject{

    public ComparableRectangle() {}
    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    /**
     * 比较面积大小
     * @param o
     * @return 返回0 面积相等, 1 前面大, -1 后面大, 2 不是同一个类
     */
    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }

        if (o instanceof ComparableRectangle) {
            ComparableRectangle cr = (ComparableRectangle) o;
            return Double.compare(this.findArea(), cr.findArea());
        } else {
            return 2;
        }
    }
}
