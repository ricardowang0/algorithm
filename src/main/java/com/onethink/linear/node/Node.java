package com.onethink.linear.node;

public class Node<T> {
    public Node next;
    public T data;

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }
}