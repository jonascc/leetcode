package com.jonas.leetcode.dsa.scottbarrett.singlylinkedlist;

public class LinkedListFindKthNodeFromEnd {

    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedListFindKthNodeFromEnd(int value) {
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
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

//  The linked list does not store its length, so you must determine the correct node without using a size property.
//  The value of k is 1-based.
//  You must solve this problem using the two-pointer technique, ensuring the solution runs in a single traversal of the list (O(n) time, O(1) space).
//  My implementation:
    public Node findKthFromEnd(int k) {
        //   +===================================================+
        //   | Description:                                      |
        //   | - Finds the k-th node from the end of a singly    |
        //   |   linked list.                                    |
        //   | - Returns the node at that position or null if    |
        //   |   `k` is invalid or exceeds the list length.      |
        //   |                                                   |
        //   | Behavior:                                         |
        //   | - Uses two pointers, `fast` and `slow`, starting  |
        //   |   at the head of the list.                        |
        //   | - Moves `fast` forward `k` nodes ahead of `slow`. |
        //   | - Then moves both pointers together until `fast`  |
        //   |   reaches the end.                                |
        //   | - At that point, `slow` points to the k-th node   |
        //   |   from the end and is returned.                   |
        //   +===================================================+
        if (head == null) return null;
        if (k <= 0) return null;
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < k; i++) {
            if (fast.next == null && i == k - 1){
                return slow;
            } else if (fast.next == null && i < k - 1) {
                return null;
            }
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

//  Reference implementation:
//    public Node findKthFromEnd(int k) {
//        if (k <= 0) return null;
//
//        Node slow = head;
//        Node fast = head;
//
//        for (int i = 0; i < k; i++) {
//            if (fast == null) return null;
//            fast = fast.next;
//        }
//
//        while (fast != null) {
//            slow = slow.next;
//            fast = fast.next;
//        }
//
//        return slow;
//    }

    static void main() {
        LinkedListFindKthNodeFromEnd myLinkedList = new LinkedListFindKthNodeFromEnd(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        System.out.println(myLinkedList.findKthFromEnd(2).value);
    }

}
