package com.jonas.leetcode.dsa.scottbarrett.singlylinkedlist;

public class LinkedListHasLoop {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedListHasLoop(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

//  The method should be able to detect if there is a cycle or loop present in the linked list.
//  You are required to use Floyd's cycle-finding algorithm (also known as the "tortoise and the hare" algorithm) to detect the loop.
//  This algorithm uses two pointers: a slow pointer and a fast pointer. The slow pointer moves one step at a time, while the fast pointer moves two steps at a time. If there is a loop in the linked list, the two pointers will eventually meet at some point. If there is no loop, the fast pointer will reach the end of the list.
//  If your Linked List contains a loop, it indicates a flaw in its implementation.
//  My implementation:
    public boolean hasLoop() {
        if (head == null) return false;
        Node slow = head;
        Node fast = head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast.next != null) {
                fast = fast.next;
            }
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

//  Reference implementation:
//    public boolean hasLoop() {
//        Node slow = head;
//        Node fast = head;
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//
//            if (slow == fast) {
//                return true;
//            }
//        }
//
//        return false;
//    }

    static void main() {
        LinkedListHasLoop myLinkedList = new LinkedListHasLoop(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        // Examples of situations where we have a loop
        myLinkedList.tail.next = myLinkedList.head;
//        myLinkedList.tail.next = myLinkedList.head.next;

        System.out.println(myLinkedList.hasLoop());
    }

}
