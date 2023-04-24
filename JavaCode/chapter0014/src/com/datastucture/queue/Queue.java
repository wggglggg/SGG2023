package com.datastucture.queue;

/**
 * ClassName: Queue
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/24 20:26
 * @Version 1.0
 */
public class Queue {
    private Object[] value;
    private int size;

    public Queue(int length) {
        value = new Object[length];
    }

    // 添加
    public void add(Object element) {
        if (size >= value.length) {
            throw new RuntimeException("队列已满，添加失败");
        }

        value[size] = element;
        size++;
    }

    // 删除
    public Object delete(){
        if (size <= 0) {
            throw new RuntimeException("队列已空，删除失败");
        }

        Object obj = value[0];

        // 剩余向前移动
        for (int i = 0; i < size-1; i++) {
            value[i] = value[i+1];
        }
        value[size-1] = null;
        size--;

        return obj;
    }

    // 获取
    public Object get(){
        if (size <= 0) {
            throw new RuntimeException("队列已空，删除失败");
        }

        Object obj = value[0];
        return obj;
    }
}
