package com.jonas.leetcode.dsa.scottbarrett.singlylinkedlist;

public class LinkedListReverseBetween {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedListReverseBetween(int value) {
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
        if (length == 0) {
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

//  In the LinkedList class, implement a method called reverseBetween that reverses the nodes of the list between indexes startIndex and endIndex (inclusive).
//  It's important to note that you should only rearrange the nodes themselves, not just their values.
//  Note: The Linked List does NOT have a tail which will make the implementation easier.
//  Assumption: You can assume that startIndex and endIndex are not out of bounds.
//  The method should not return any value, and it should modify the original linked list.
//  The positions startIndex and endIndex are 0-indexed.
//  Example:
//  Given the following linked list: 1 -> 2 -> 3 -> 4 -> 5
//  Calling reverseBetween(1, 3) should result in the following modified linked list: 1 -> 4 -> 3 -> 2 -> 5
//  My implementation:
    public void reverseBetween(int m, int n) {
        if (n <= 1) return;
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = null;
        Node curr = null;
        Node toMove = null;
        int i = 0;
        while (i <= m) {
            if (prev == null) {
                prev = dummy;
            } else {
                prev = prev.next;
            }
            curr = prev.next;
            toMove = curr.next;
            i++;
        }
        while (i <= n) {
            curr.next = toMove.next;
            toMove.next = prev.next;
            prev.next = toMove;
            i++;
            toMove = curr.next;
        }
        head = dummy.next;
    }

//  Reference implementation:
//    public void reverseBetween(int startIndex, int endIndex) {
//        if (head == null) return;
//
//        Node dummyNode = new Node(0);
//        dummyNode.next = head;
//        Node previousNode = dummyNode;
//
//        for (int i = 0; i < startIndex; i++) {
//            previousNode = previousNode.next;
//        }
//
//        Node currentNode = previousNode.next;
//
//        for (int i = 0; i < endIndex - startIndex; i++) {
//            Node nodeToMove = currentNode.next;
//            currentNode.next = nodeToMove.next;
//            nodeToMove.next = previousNode.next;
//            previousNode.next = nodeToMove;
//        }
//        head = dummyNode.next;
//    }

    static void main() {
        LinkedListReverseBetween myLinkedList = new LinkedListReverseBetween(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        myLinkedList.reverseBetween(1, 3);
        myLinkedList.printList();
    }

}
