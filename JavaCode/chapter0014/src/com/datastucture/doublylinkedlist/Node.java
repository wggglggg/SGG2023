package com.datastucture.doublylinkedlist;

/**
 * ClassName: Node
 * Description:
 *  双向链表
 * @Author wggglggg
 * @Create 2023/4/24 19:51
 * @Version 1.0
 */
public class Node {
    private Node prev;
    private Object data;
    private Node next;

    public Node( Object data) {
        this.data = data;
    }

    public Node(Node prev, Object data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
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
