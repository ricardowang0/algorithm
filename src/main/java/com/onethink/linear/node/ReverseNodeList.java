package com.onethink.linear.node;

/**
 * INPUT 1->2->3->4
 * output: 4->3->2->1
 * 反转链表
 */
public class ReverseNodeList {
    public static void main(String[] args) {
        LinkList<Integer> linkList = new LinkList();
        linkList.insert(1);
        linkList.insert(2);
        linkList.insert(3);
        linkList.insert(4);
        System.out.println(linkList);
        reverseByIteration(linkList);
        System.out.println(linkList.toString());
    }

    /**
     * 递归方式反转
     *
     * @return void
     * @author wangjie
     * @date 2023/1/31 22:03
     * @since 1.0.0
     */
    static void reverseByRecursion(LinkList list) {
        reverseByRecursion(list.head.next, list);
    }

    private static Node reverseByRecursion(Node node, LinkList list) {
        if (node.next == null) {
            //头结点指向最后一个结点
            list.head.next = node;
            return node;
        }
        //next的结点为新链表结点前一个
        Node pre = reverseByRecursion(node.next, list);
        pre.next = node;
        return node;
    }

    /**
     * 迭代
     * 从第一个元素开始遍历，设置一个指针curr = 元素1 prev =null 临时变量next存储元素2，
     * 改变元素1指向prev
     * prev指向 元素1 ，curr指向next
     *
     * @param list:
     * @return void
     * @author wangjie
     * @date 2023/1/31 22:33
     * @since 1.0.0
     */
    static void reverseByIteration(LinkList list) {
        Node prev = null;
        Node curr = list.head.next;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //头指针指向最后一个元素
        list.head.next = prev;
    }
}
