package com.jonas.leetcode.dsa.scottbarrett.binarysearchtree;

public class Main {

    static void main() {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);

        myBST.insert(27);

        System.out.println(myBST.contains(52));
        System.out.println(myBST.contains(23));

        System.out.println(myBST.root.left.right.value);
    }

}
