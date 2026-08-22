package com.jonas.leetcode.dsa.laforesbook.sorting.selectSort;

public class ArraySel {

    private final long[] a;
    private int nElems;

    public ArraySel(int max) {
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
        int min;

        for (out = 0; out < nElems - 1; out++) {
           min = out;
           for (in = out + 1; in < nElems; in++) {
               if (a[in] < a[min]) {
                   min = in;
               }
           }
           swap(out, min);
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

}
