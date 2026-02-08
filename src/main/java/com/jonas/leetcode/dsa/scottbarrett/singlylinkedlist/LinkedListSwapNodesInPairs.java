package com.jonas.leetcode.dsa.scottbarrett.singlylinkedlist;

public class LinkedListSwapNodesInPairs {
    private Node head;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedListSwapNodesInPairs(int value) {
        Node newNode = new Node(value);
        head = newNode;
    }

    public Node getHead() {
        return head;
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
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

//  Write a method swapPairs() inside a LinkedList class that swaps every two adjacent nodes in a singly linked list.
//  This method should update the linked list in-place by changing the next pointers — not by swapping values.
//  The Linked List does not have tail or length attributes (you will not need them).
//  The method should work correctly for:
//  - empty lists,
//  - single-node lists,
//  - even-length lists,
//  - odd-length lists.
//  My implmentation
    public void swapPairs() {
        //   +===================================================+
        //   | Description:                                      |
        //   | - Swaps every two adjacent nodes in the linked    |
        //   |   list.                                           |
        //   | - The method modifies the list in place.          |
        //   |                                                   |
        //   | Behavior:                                         |
        //   | - A dummy node is used to simplify swapping the   |
        //   |   first pair.                                     |
        //   | - In each iteration, two nodes (`first` and       |
        //   |   `second`) are swapped by adjusting pointers.    |
        //   | - The `previous` pointer helps reconnect the      |
        //   |   swapped pairs to the rest of the list.          |
        //   | - The `first` pointer then moves forward two      |
        //   |   nodes at a time.                                |
        //   | - At the end, `head` is updated to point to the   |
        //   |   new first node.                                 |
        //   +===================================================+
        if (head == null || head.next == null) return;
        Node dummy = new Node(-1);
        Node prev = dummy;
        Node first = null;
        Node second = null;
        if (dummy.next == null) dummy.next = head;
        first = dummy.next;
        second = first.next;
        int i = 0;
        while (first != null && first.next != null) {
            first.next = second.next;
            if (i == 0) {
                dummy.next = second;
                second.next = first;
            } else {
                prev.next = second;
                second.next = first;
            }
            prev = first;
            first = first.next;
            if (first != null) second = first.next;

            i++;
        }
        head = dummy.next;
    }

//  Reference implementation:
//    public void swapPairs() {
//        Node dummy = new Node(0);
//        dummy.next = head;
//        Node previous = dummy;
//        Node first = head;
//
//        while (first != null && first.next != null) {
//            Node second = first.next;
//
//            // Perform the swap
//            previous.next = second;
//            first.next = second.next;
//            second.next = first;
//
//            // Move pointers
//            previous = first;
//            first = first.next;
//        }
//        head = dummy.next;
//    }

    static void main() {
        LinkedListSwapNodesInPairs myLinkedList = new LinkedListSwapNodesInPairs(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        myLinkedList.swapPairs();
        myLinkedList.printList();
    }

}
