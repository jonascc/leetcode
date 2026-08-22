package com.jonas.leetcode.dsa.laforesbook.sorting.insertsort;

public class ArrayIns {

    private final long[] a;
    private int nElems;

    public ArrayIns(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            IO.print(a[j] + " ");
        }
        IO.println();
    }

    public void selectionSort() {
        int out;
        int in;

        for (out = 1; out < nElems; out++) {
            long temp = a[out];
            in = out;
            while (in > 0 && a[in - 1] >= temp) {
                a[in] = a[in - 1];
                in--;
            }
           a[in] = temp;
        }
    }

}
