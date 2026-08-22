package com.jonas.leetcode.dsa.laforesbook.sorting.selectSort;

public class SelectSortApp {

    static void main() {
        int maxSize = 100;
        ArraySel arr = new ArraySel(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        arr.display();
        arr.selectionSort();
        arr.display();
    }

}
