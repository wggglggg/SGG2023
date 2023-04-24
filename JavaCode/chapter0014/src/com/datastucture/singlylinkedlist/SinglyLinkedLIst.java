package com.datastucture.singlylinkedlist;

import org.junit.Test;

/**
 * ClassName: SinglyLinkedLIst
 * Description:
 *      单向链表测试
 * @Author wggglggg
 * @Create 2023/4/24 19:46
 * @Version 1.0
 */
public class SinglyLinkedLIst {
    @Test
    public void test1(){
        // 创建对象：
        Node node1 = new Node("AA");
        Node node2 = new Node("BB");
        // 上一个node保存下一个node位置，形成链式单向结构
        node1.setNext(node2);
    }
}
