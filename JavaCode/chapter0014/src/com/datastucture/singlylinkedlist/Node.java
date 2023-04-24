package com.datastucture.singlylinkedlist;

/**
 * ClassName: Node
 * Description:
 *  单向链表
 * @Author wggglggg
 * @Create 2023/4/24 19:44
 * @Version 1.0
 */
public class Node {
    private Object data;
    private Node next;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
