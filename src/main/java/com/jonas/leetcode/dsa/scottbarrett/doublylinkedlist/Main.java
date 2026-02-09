package com.jonas.leetcode.dsa.scottbarrett.doublylinkedlist;

public class Main {

    static void main() {
        DoublyLinkedList myDLL = new DoublyLinkedList(0);

        myDLL.append(1);
        myDLL.append(2);

        myDLL.remove(1);
        myDLL.printList();
    }

}
