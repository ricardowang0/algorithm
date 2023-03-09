package com.onethink.linear.node;

/**
 * 链表
 */
public class LinkList<T> {
    //记录头结点
    public Node head;
    //记录链表的长度
    public int size;


    public LinkList() {
        //初始化头结点、
        this.head = new Node(null, null);
        //初始化元素个数
        this.size = 0;
    }

    public void insert(T item) {
        Node n = head;
        //找到最后一个元素的位置
        while (n.next != null) {
            n = n.next;
        }
        n.next = new Node(item, null);
        size++;
    }

    //清空链表
    public void clear() {
        head.next = null;
        this.size = 0;
    }

    //获取链表的长度
    public int length() {
        return size;
    }

    //判断链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //获取指定位置i出的元素
    public T get(int i) {

        //通过循环,从头结点开始往后找，依次找i次，就可以找到对应的元素
        Node n = head.next;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        return (T) n.data;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node n = head.next;
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                sb.append(n.data);
            } else {
                sb.append(n.data).append(",");
            }
            n = n.next;
        }
        return sb.toString();
    }
}
