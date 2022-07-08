package com.msb.kupai.code02;

/*************************************************************************
 ******
 * - Copyright (c) 2022 shangzhao.com
 * - File Name: LinkdeLiist
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2022/6/20   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class LinkdeLiist {
    public static void main(String[] args) {
        LindNode lindNode1 = new LindNode(1, "1");
        LindNode lindNode2 = new LindNode(2, "2");
        LindNode lindNode3 = new LindNode(3, "3");
        LindNode lindNode4 = new LindNode(4, "4");
        LindList lindList = new LindList();
        lindList.add(lindNode1);
        lindList.add(lindNode2);
        lindList.add(lindNode3);
        lindList.add(lindNode4);
//        lindList.delete(lindNode4);
        lindList.rever();
        lindList.list();
    }
}

class LindList {

    private LindNode node = new LindNode(0, "");

    public void add(LindNode lindNode) {
        LindNode temp = this.node;
        while (true) {
            if (temp.next == null) {
                temp.next = lindNode;
                break;
            }
            temp = temp.next;
        }
    }

    public void list() {
        LindNode temp = this.node;
        while (true) {
            if (temp.next == null) {
                break;
            }
            System.out.println(temp.next);
            temp = temp.next;
        }

    }

    public void rever() {
        LindNode current = node.next;
        LindNode pro = null;
        LindNode initNode = new LindNode(0, "");
        while (true) {
            if (current == null) {
                break;
            }
            pro = current.next;
            current.next = initNode.next;
            initNode.next = current;
            current = pro;
        }
        node.next = initNode.next;
    }

    public void delete(LindNode lindNode1) {
        LindNode temp = node.next;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                flag = true;
                break;
            } else if (temp.next.no == lindNode1.no) {
                break;
            }
            temp = temp.next;
        }
        if (!flag) {
            temp.next = temp.next.next;
        } else {
            System.out.println("未找到");
        }

    }
}

class LindNode {
    public int no;
    public String name;
    public LindNode next;

    public LindNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "LindNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
