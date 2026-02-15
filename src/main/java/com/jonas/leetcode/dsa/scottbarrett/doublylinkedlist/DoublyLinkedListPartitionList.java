package com.jonas.leetcode.dsa.scottbarrett.doublylinkedlist;

public class DoublyLinkedListPartitionList {

    private Node head;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedListPartitionList(int value) {
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

// What This Exercise Is Designed to Teach
// - How to traverse and manipulate nodes in a doubly linked list.
// - Maintaining correct .prev and .next pointers while restructuring.
// - Use of dummy nodes to simplify head handling.
// Example Inputs and Outputs:
// Input:  3 <-> 8 <-> 5 <-> 10 <-> 2 <-> 1, x = 5
// Output: 3 <-> 2 <-> 1 <-> 8 <-> 5 <-> 10
// Input: 1 <-> 2 <-> 3, x = 5
// Output: 1 <-> 2 <-> 3
// Input: 6 <-> 7 <-> 8, x = 5
// Output: 6 <-> 7 <-> 8
// Reference implementation
    public void partitionList(int x) {
        //   +===================================================+
        //   |               WRITE YOUR CODE HERE                |
        //   | Description:                                      |
        //   | - Partitions a doubly linked list around a value  |
        //   |   `x`.                                            |
        //   | - Nodes with values less than `x` come before     |
        //   |   nodes with values greater than or equal to `x`. |
        //   |                                                   |
        //   | Behavior:                                         |
        //   | - Uses two dummy nodes to build two sublists:     |
        //   |   one for < x, one for >= x.                      |
        //   | - Traverses the list, linking nodes to the        |
        //   |   appropriate sublist and updating prev pointers. |
        //   | - Joins the two sublists together.                |
        //   | - Updates the head and resets head.prev to null.  |
        //   +===================================================+
        // If the list is empty, nothing to do
        if (head == null) return;

        // Create two dummy nodes to help build two new lists
        Node dummy1 = new Node(0); // List for nodes < x
        Node dummy2 = new Node(0); // List for nodes >= x

        // Use these pointers to build the two lists
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        Node current = head;

        // Traverse the original list
        while (current != null) {
            if (current.value < x) {
                // Attach node to dummy1 list
                prev1.next = current;
                current.prev = prev1;
                prev1 = current;
            } else {
                // Attach node to dummy2 list
                prev2.next = current;
                current.prev = prev2;
                prev2 = current;
            }
            current = current.next;
        }

        // End the second list to avoid any trailing connections
        prev2.next = null;

        // Connect the two lists
        prev1.next = dummy2.next;

        // If dummy2 list has nodes, fix their prev pointer
        if (dummy2.next != null) {
            dummy2.next.prev = prev1;
        }

        // Update head pointer of the main list
        head = dummy1.next;

        // Ensure new head has no previous pointer
        if (head != null) {
            head.prev = null;
        }
// Explanation of the Code:
// We first create two dummy nodes: dummy1 for values < x and dummy2 for values >= x.
// We traverse the entire list, attaching nodes to one of the two dummy lists based on their value.
// After the loop, we terminate the greater list by setting prev2.next = null.
// Then we connect the two lists by linking the end of the first to the start of the second.
// Finally, we update head to point to the start of the new rearranged list.
    }

    static void main() {
        DoublyLinkedListPartitionList myDLL = new DoublyLinkedListPartitionList(3);
        myDLL.append(8);
        myDLL.append(5);
        myDLL.append(10);
        myDLL.append(2);
        myDLL.append(1);

        myDLL.partitionList(5);
        myDLL.printList();
    }

}
