package com._interface.exer2;

/**
 * ClassName: CompareObject
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/30 14:43
 * @Version 1.0
 */
public interface CompareObject {

    //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
    int compareTo(Object o);
}
