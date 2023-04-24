package com.datastucture.doublylinkedlist;

import org.junit.Test;

/**
 * ClassName: DoublyLinkedList
 * Description:
 *  双向链表测试
 * @Author wggglggg
 * @Create 2023/4/24 19:52
 * @Version 1.0
 */
public class DoublyLinkedList {
    @Test
    public void test1(){
        Node node1 = new Node("AA");
        Node node2 = new Node("BB");
        Node node3 = new Node("CC");

        node1.setPrev(null);
        node1.setNext(node2);
        node2.setPrev(node1);
        node2.setNext(node3);
        node3.setPrev(node2);
    }
}
