package com.jonas.leetcode.dsa.scottbarrett.singlylinkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedListRemoveDuplicates {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedListRemoveDuplicates(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

//  Your method should not create a new list, but rather modify the existing list in-place, preserving the relative order of the nodes.
//  You can implement the removeDuplicates() method in two different ways:
//  - Using a Set (HashSet) - This approach will have a time complexity of O(n), where n is the number of nodes in the linked list. You are allowed to use the provided Set data structure in your implementation.
//  - Without using a Set - This approach will have a time complexity of O(n^2), where n is the number of nodes in the linked list. You are not allowed to use any additional data structures for this implementation.
//  Solution Using a Set:
    public void removeDuplicates() {
        Set<Integer> values = new HashSet<>();
        Node previous = null;
        Node current = head;
        while (current != null) {
            if (values.contains(current.value)) {
                previous.next = current.next;
                length -= 1;
            } else {
                values.add(current.value);
                previous = current;
            }
            current = current.next;
        }
    }

//  Solution without using a Set:
//  My implementation:
//    public void removeDuplicates() {
//        if (head == null) return;
//        Node current = head;
//        Node temp;
//        Node runner;
//        while (current != null) {
//            temp = current;
//            runner = current.next;
//            int val = current.value;
//            while (runner != null) {
//                if (runner.value == val) {
//                    temp.next = runner.next;
//                } else {
//                    temp = temp.next;
//                }
//                runner = runner.next;
//            }
//            current = current.next;
//        }
//    }

//  Solution without using a Set:
//  Reference implementation:
//    public void removeDuplicates() {
//        Node current = head;
//        while (current != null) {
//            Node runner = current;
//            while (runner.next != null) {
//                if (runner.next.value == current.value) {
//                    runner.next = runner.next.next;
//                    length -= 1;
//                } else {
//                    runner = runner.next;
//                }
//            }
//            current = current.next;
//        }
//    }

    static void main() {
        LinkedListRemoveDuplicates myLinkedList = new LinkedListRemoveDuplicates(1);
        myLinkedList.append(2);
        myLinkedList.append(2);
        myLinkedList.append(4);
        myLinkedList.append(5);

        myLinkedList.removeDuplicates();
        myLinkedList.printList();
    }

}
