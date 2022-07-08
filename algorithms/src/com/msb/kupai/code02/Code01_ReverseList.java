package com.msb.kupai.code02;

/*************************************************************************
 ******
 * - Copyright (c) 2022 shangzhao.com
 * - File Name: Code01_ReverseList
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2022/6/19   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class Code01_ReverseList {


    public static void main(String[] args) {
        Node node1 = new Node(1, "1");
        Node node2 = new Node(2, "2");
        Node node3 = new Node(3, "3");
        Node node4 = new Node(4, "4");
        Node node5 = new Node(4, "5");
        SingLeLinkdList singLeLinkdList = new SingLeLinkdList();
        singLeLinkdList.add(node1);
        singLeLinkdList.add(node2);
        singLeLinkdList.add(node3);
        singLeLinkdList.addByorder(node4);
        singLeLinkdList.update(node5);
        singLeLinkdList.delete(node5);
        singLeLinkdList.list();
        singLeLinkdList.reverseLinkedLinkedList();
//        singLeLinkdList.list();
//        System.out.println(singLeLinkdList.count());

    }
}

class SingLeLinkdList {
    private Node head = new Node(0, "");

    public void add(Node node) {
        Node temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
    }

    public void update(Node node) {
        Node temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                flag = true;
                break;
            } else if (temp.next.value == node.value) {
                flag = false;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println("未找到！");
        } else {
            temp.next.name = node.name;

        }
    }

    public void addByorder(Node node) {
        Node temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            } else if (temp.next.value > node.value) {
                break;
            } else if (temp.next.value == node.value) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println("已存在");
        } else {
            temp.next = node;
        }
    }

    public void list() {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        Node temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public int count() {
        Node temp = head;
        int count = 0;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
            count++;
        }
        return count;
    }

    public void delete(Node node) {
        Node temp = head.next;
        boolean flag = false;

        while (true) {
            if (temp.next == null) {
                flag = true;
                System.out.println("链表为空");
                break;
            } else if (temp.next.value == node.value) {
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println("未找到");
        } else {
            temp.next = temp.next.next;
        }
    }

    /**
     * 反转单链表
     *
     * @return
     */
    public void reverseLinkedLinkedList() {
        Node current = head.next;
        Node next = null;
        Node initNode = new Node(0, "");
        while (current != null) {
            next = current.next;
            current.next = initNode.next;
            initNode.next = current;
            current = next;
        }
        head.next = initNode.next;
    }
}

class Node {
    public int value;
    public String name;
    public Node next;

    public Node(int data, String name) {
        this.value = data;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
