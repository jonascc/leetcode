package com.jonas.leetcode.dsa.scottbarrett.doublylinkedlist;

public class DoublyLinkedListIsPalindrome {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedListIsPalindrome(int value) {
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
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append (int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public boolean isPalindrome() {
        if (length == 1 || length == 0) return true;
        Node forward = head;
        Node backward = tail;
        while (forward != backward && forward.next != backward){
            if (forward.value != backward.value) {
                return false;
            }
            forward = forward.next;
            backward = backward.prev;
        }
        return forward.value == backward.value;
    }

// Reference implementation
//    public boolean isPalindrome() {
//        if (length <= 1) return true;
//
//        Node forwardNode = head;
//        Node backwardNode = tail;
//        for (int i = 0; i < length / 2; i++) {
//            if (forwardNode.value != backwardNode.value) return false;
//            forwardNode = forwardNode.next;
//            backwardNode = backwardNode.prev;
//        }
//        return true;
//    }

    static void main() {
        DoublyLinkedListIsPalindrome myDLL = new DoublyLinkedListIsPalindrome(1);
        myDLL.append(1);
//        myDLL.append(3);
//        myDLL.append(2);
//        myDLL.append(1);

        System.out.println(myDLL.isPalindrome());
    }

}
