package com.jonas.leetcode.dsa.scottbarrett.doublylinkedlist;

public class DoublyLinkedListReverseBetween {

    private Node head;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedListReverseBetween(int value) {
        Node newNode = new Node(value);
        head = newNode;
    }

    public Node getHead() {
        return head;
    }

    public void printList() {
        StringBuilder output = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            output.append(temp.value);
            if (temp.next != null) {
                output.append(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(output.toString());
    }

    public void makeEmpty() {
        head = null;
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
            newNode.prev = current;
        }
    }

// Constraints:
// startIndex and endIndex are zero-based.
// The list may be empty or contain a single node.
// If startIndex == endIndex, no changes should occur.
// You must maintain the integrity of both next and prev pointers.
//
// What This Exercise Is Designed to Teach
// How to traverse and manipulate a doubly linked list.
// How to reverse a sublist in-place by relinking nodes.
// Safe pointer handling for both next and prev in a DLL.
// Reference implementation
    public void reverseBetween(int startIndex, int endIndex) {
        //   +===================================================+
        //   |               WRITE YOUR CODE HERE                |
        //   | Description:                                      |
        //   | - Reverses a portion of a doubly linked list      |
        //   |   between two indices (inclusive range).          |
        //   | - Only nodes between startIndex and endIndex are  |
        //   |   reversed in place.                              |
        //   |                                                   |
        //   | Behavior:                                         |
        //   | - A dummy node simplifies handling edge cases.    |
        //   | - `prev` is positioned just before the reversal.  |
        //   | - Nodes are relocated one at a time to reverse    |
        //   |   their order within the specified segment.       |
        //   | - All `next` and `prev` pointers are correctly    |
        //   |   updated to maintain list integrity.             |
        //   | - The head pointer is reset at the end.           |
        //   +===================================================+
        if (head == null || startIndex == endIndex) {
            return;
        }

        // Create a dummy node to simplify edge cases
        Node dummy = new Node(0);
        dummy.next = head;
        head.prev = dummy;

        // Step 1: Move 'prev' to the node before startIndex
        Node prev = dummy;
        for (int i = 0; i < startIndex; i++) {
            prev = prev.next;
        }

        // Step 2: Start reversing from 'current' = prev.next
        Node current = prev.next;

        // Step 3: Reverse by relocating nodes one at a time
        for (int i = 0; i < endIndex - startIndex; i++) {
            Node nodeToMove = current.next;

            // Remove nodeToMove from its place
            current.next = nodeToMove.next;
            if (nodeToMove.next != null) {
                nodeToMove.next.prev = current;
            }

            // Move nodeToMove to the front of the sublist
            nodeToMove.next = prev.next;
            prev.next.prev = nodeToMove;

            prev.next = nodeToMove;
            nodeToMove.prev = prev;
        }

        // Step 4: Update head in case it changed
        head = dummy.next;
        head.prev = null;
// Explanation of the Code:
// We return early if there is nothing to reverse (i.e., empty list or start == end).
// We create a dummy node that temporarily sits before the head.
// We navigate to the node before the reversal section.
// Using a loop, we move one node at a time to the front of the reversing window.
// We correctly reassign all next and prev links for spliced nodes.
// After reversing the sublist, we update the head from the dummy.
// The dummy’s influence is cleaned by setting the real head’s prev to null.
    }

    static void main() {
        DoublyLinkedListReverseBetween myDLL = new DoublyLinkedListReverseBetween(1);
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(7);
        myDLL.append(3);

        myDLL.reverseBetween(3, 4);
        myDLL.printList();
    }

}
