package com.msb.kupai.code02;

/*************************************************************************
 ******
 * - Copyright (c) 2022 shangzhao.com
 * - File Name: Code04_DouBleLinkedList
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
public class Code02_DouBleLinkedList {
    public static void main(String[] args) {

    }

}

class DoubleLinkedList {
    private DouBleNode doubleNode = new DouBleNode(1, "");

    public void list() {
        if (doubleNode.next == null) {
            System.out.println("链表为空");
            return;
        }
        DouBleNode temp = doubleNode.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public void add(DouBleNode doubleNode) {
        DouBleNode temp = doubleNode;

        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = doubleNode;
        doubleNode.pro = temp;
    }
    public void update(DouBleNode node) {
        DouBleNode temp = doubleNode;
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
}

class DouBleNode {
    public int value;
    public String name;
    public DouBleNode next;
    public DouBleNode pro;

    public DouBleNode(int value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString() {
        return "DouBleNode{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
