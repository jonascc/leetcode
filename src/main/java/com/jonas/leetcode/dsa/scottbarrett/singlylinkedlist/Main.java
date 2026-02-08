package com.jonas.leetcode.dsa.scottbarrett.singlylinkedlist;

public class Main {

    static void main() {
        LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);

        myLinkedList.printList();
        System.out.println();
        myLinkedList.reverse();
        myLinkedList.printList();
    }

}
