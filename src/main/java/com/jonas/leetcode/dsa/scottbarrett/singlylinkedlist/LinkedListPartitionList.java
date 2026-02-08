package com.jonas.leetcode.dsa.scottbarrett.singlylinkedlist;

public class LinkedListPartitionList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedListPartitionList(int value) {
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
        if (temp == null) {
            System.out.println("empty");
        } else {
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
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

//  You have a singly linked list that DOES NOT HAVE A TAIL POINTER  (which will make this method simpler to implement).
//  Given a value x you need to rearrange the linked list such that all nodes with a value less than x come before all nodes with a value greater than or equal to x.
//  Additionally, the relative order of nodes in both partitions should remain unchanged.
//  Constraints:
//  - The solution should traverse the linked list at most once.
//  - The solution should not create a new linked list.
//  Example:
//  Input:
//  Linked List: 3 -> 8 -> 5 -> 10 -> 2 -> 1 x: 5
//  Process:
//  Values less than 5: 3, 2, 1
//  Values greater than or equal to 5: 8, 5, 10
//  Output:
//  Linked List: 3 -> 2 -> 1 -> 8 -> 5 -> 10
//  My implementation:
    public void partitionList(int x) {
        if (head == null) return;
        Node d1 = null;
        Node temp1 = null;
        Node d2 = null;
        Node temp2 = null;
        while (head != null) {
            if (head.value < x) {
                if (d1 == null) {
                    d1 = new Node(head.value);
                    temp1 = d1;
                } else {
                    temp1.next = head;
                    temp1 = temp1.next;
                }
            } else {
                if (d2 == null) {
                    d2 = new Node(head.value);
                    temp2 = d2;
                } else {
                    temp2.next = head;
                    temp2 = temp2.next;
                }
            }
            head = head.next;
        }
        if (temp1 != null) {
            if (temp2 != null) temp2.next = null;
            temp1.next = d2;
            head = d1;
        } else {
            head = d2;
        }
    }

//  Reference implementation:
//    public void partitionList(int x) {
//        if (head == null) return;
//
//        Node dummy1 = new Node(0);
//        Node dummy2 = new Node(0);
//        Node prev1 = dummy1;
//        Node prev2 = dummy2;
//        Node current = head;
//
//        while (current != null) {
//            if (current.value < x) {
//                prev1.next = current;
//                prev1 = current;
//            } else {
//                prev2.next = current;
//                prev2 = current;
//            }
//            current = current.next;
//        }
//
//        prev2.next = null;
//        prev1.next = dummy2.next;
//
//        head = dummy1.next;
//    }

    static void main() {
        LinkedListPartitionList myLinkedList = new LinkedListPartitionList(3);
        myLinkedList.append(8);
        myLinkedList.append(5);
        myLinkedList.append(10);
        myLinkedList.append(2);
        myLinkedList.append(1);

        myLinkedList.partitionList(5);
        myLinkedList.printList();
    }

}
