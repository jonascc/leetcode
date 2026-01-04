package com.jonas.leetcode;

public class _155MinStack {

    private final int[] stack;
    private final int[] minValIndexes;
    private int top = -1;
    private int i = -1;

    public _155MinStack() {
        stack = new int[30_000];
        minValIndexes = new int[30_000];
    }

    public void push(int val) {
        stack[++top] = val;
        if (i == -1 || val < stack[minValIndexes[i]]) {
            minValIndexes[++i] = top;
        }
    }

    public void pop() {
        if (top == minValIndexes[i]) {
            i--;
        }
        top--;
    }

    public int top() {
        return stack[top];
    }

    public int getMin() {
        return stack[minValIndexes[i]];
    }

}
