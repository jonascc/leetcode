package com.jonas.leetcode.dsa.scottbarrett.queue;

public class Main {

    static void main() {
        Queue myQueue = new Queue(6);

        myQueue.enqueue(8);

        System.out.println(myQueue.dequeue().value);

    }

}
