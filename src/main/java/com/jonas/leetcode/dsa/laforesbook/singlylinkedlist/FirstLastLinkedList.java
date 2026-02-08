package com.jonas.leetcode.dsa.laforesbook.singlylinkedlist;

public class FirstLastLinkedList {

    private Link2 first;
    private Link2 last;

    public FirstLastLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long lData) {
        Link2 newLink = new Link2(lData);

        if (isEmpty()) {
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long lData) {
        Link2 newLink = new Link2(lData);

        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    public long deleteFirst() {
        long temp = first.lData;

        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("List (first -> last): ");
        Link2 current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

}
