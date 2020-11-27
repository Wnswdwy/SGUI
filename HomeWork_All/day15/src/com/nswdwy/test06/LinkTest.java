package com.nswdwy.test06;

/**
 * @author yycstart
 * @create 2020-08-11 22:08
 */
class Node {
    int value; // 数据域
    Node next; // 指针域
}

class Link {

    private Node head;
    private Node tail;
    int num = 0;

    public void add(int val) {
        Node newNode = new Node();
        newNode.value = val; // 携带数据
        // 如果是第一次插入
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            // 让老尾的next指向新结点
            tail.next = newNode;
            // 刷新老尾为新结点.
            tail = newNode;
            num++;
        }
    }

    public void travel() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public int size() {
        return num;
    }

    public void remove(int val) {
        if (head.value == val) {
            head = head.next.next;
            num--;
        } else if(tail.next == null){
            tail.value  =
            num--;
        }else{
            Node prev = head;
            while (true) {
                if (prev.next.value == val) {
                    // 在这里删除节点
                    // 删除目标节点的next地址回刷给prev.next

                }
                num--;
            }
        }
    }
}

public class LinkTest {

    public static void main(String[] args) {
        Link link = new Link();
        link.add(8);
        link.add(1);
        link.add(4);
        link.add(2);
        link.add(9);
        link.add(6);
        link.add(3);

        link.travel();

    }
}
