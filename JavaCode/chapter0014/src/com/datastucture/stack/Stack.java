package com.datastucture.stack;

import org.junit.Test;

/**
 * ClassName: Stack
 * Description:
 *  数组实现  栈
 * @Author wggglggg
 * @Create 2023/4/24 20:05
 * @Version 1.0
 */
public class Stack {
    private Object[] value;
    private int size ;       //记录存储的元素的个数

    public Stack(int length) {
        value = new Object[length];     // 构造器生成一个数组，通过length指定长度
    }

    // 入栈
    public void push(Object element) {
        if (size >= value.length) {
            throw new RuntimeException("栈空间已满");
        }
        value[size] = element;
        size++;
    }

    // 出栈
    public Object pop() {
        if (size <= 0) {
            throw new RuntimeException("栈已空");
        }

        Object lastElement = value[size-1];
        value[size-1] = null;
        size--;
        return lastElement;
    }
}
