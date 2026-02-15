package com.jonas.leetcode.dsa.scottbarrett.queue;

import com.jonas.leetcode.dsa.scottbarrett.stack.StackArrayList;

public class QueueUsingStacks {

    private StackArrayList<Integer> stack1;
    private StackArrayList<Integer> stack2;

    public QueueUsingStacks() {
        stack1 = new StackArrayList<>();
        stack2 = new StackArrayList<>();
    }

// Same as the reference implementation
    public void enqueue(int value) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public Integer dequeue() {
        if (isEmpty()) return null;
        return stack1.pop();
    }

    public int peek() {
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    static void main() {
        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println(q.peek());
    }

}
