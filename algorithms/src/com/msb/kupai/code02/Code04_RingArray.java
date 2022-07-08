package com.msb.kupai.code02;

/*************************************************************************
 ******
 * - Copyright (c) 2022 shangzhao.com
 * - File Name: Code04_RingArray
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2022/6/17   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class Code04_RingArray {
    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            value = data;
        }
    }

    public static Node reverseLinkedLinkedList(Node head) {
        Node pro = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = pro;
            pro = head;
            head = next;
        }
        return pro;
    }
}
