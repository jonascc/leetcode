package com.jonas.leetcode.dsa.scottbarrett.singlylinkedlist;

public class LinkedListBinaryToDecimal {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedListBinaryToDecimal(int value) {
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
    }

//  Steps Involved in the Function:
//  1 - A variable num is initialized to 0, which will store our computed decimal number.
//  2 - Starting from the head of the linked list (the leftmost binary digit), iterate through each node until the end.
//  3 - For every node, double the current value of num (this is analogous to shifting in binary representation). Then, add the binary digit of the current node.
//  4 - Move to the next node and repeat until you've visited all nodes.
//  5 - Return the value in num, which now represents the decimal value of the binary number in the linked list.
//  My implementation:
    public int binaryToDecimal() {
        //   +===================================================+
        //   | Description:                                      |
        //   | - This method converts a binary number,           |
        //   |   represented as a linked list, to a decimal int. |
        //   |                                                   |
        //   | Return type: int                                  |
        //   | - Returns the decimal equivalent of the binary    |
        //   |   number.                                         |
        //   |                                                   |
        //   | Tips:                                             |
        //   | - We use a while loop to traverse the linked list.|
        //   | - Multiply the current sum by 2 and add the value |
        //   |   at each node to get the decimal number.         |
        //   +===================================================+
        int num = 0;
        int i = 0;
        while (head != null) {
            if (i > 0) num = 2 * num;
            if (head.value == 1) {
                num++;
            }
            head = head.next;
            i++;
        }
        return num;
    }

//  Reference implementation:
//    public int binaryToDecimal() {
//        int num = 0;
//        Node current = head;
//        while (current != null) {
//            num = num * 2 + current.value;
//            current = current.next;
//        }
//        return num;
//    }

    static void main() {
        LinkedListBinaryToDecimal myLinkedList = new LinkedListBinaryToDecimal(1);
        myLinkedList.append(1);
        myLinkedList.append(1);
        myLinkedList.append(1);
        myLinkedList.append(1);

        System.out.println(myLinkedList.binaryToDecimal());
    }

}
