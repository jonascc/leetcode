package com.jonas.leetcode.dsa.scottbarrett.singlylinkedlist;

public class LinkedListFindMiddleNode {
    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedListFindMiddleNode(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

//  If the list has an even number of nodes, the method should return the second middle node.
//  Note:
//  In this problem, you should use the slow and fast pointer technique (also known as Floyd's Tortoise and Hare algorithm) to find the middle element of the linked list efficiently.
//  The key idea is to have two pointers, one that moves twice as fast as the other. By the time the fast pointer reaches the end of the linked list, the slow pointer will be at the middle.
//  My implementation:
    public Node findMiddleNode() {
        if (head == null) return null;
        Node slow = head;
        Node fast = head;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast.next != null) {
                fast = fast.next;
            }
        }
        return slow;
    }

//  Reference implementation:
//    public Node findMiddleNode() {
//        Node slow = head;
//        Node fast = head;
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        return slow;
//    }

    static void main() {
        LinkedListFindMiddleNode myLinkedList = new LinkedListFindMiddleNode(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        System.out.println(myLinkedList.findMiddleNode().value);
    }

}
