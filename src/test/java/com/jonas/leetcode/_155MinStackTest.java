package com.jonas.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _155MinStackTest {

    @Test
    void minStackTest() {
        _155MinStack minStack = new _155MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertThat(minStack.getMin()).isEqualTo(-3); // return -3
        minStack.pop();
        assertThat(minStack.top()).isEqualTo(0);    // return 0
        assertThat(minStack.getMin()).isEqualTo(-2); // return -2
    }

    @Test
    void minStackTest2() {
        _155MinStack minStack = new _155MinStack();
        minStack.push(-1);
        assertThat(minStack.top()).isEqualTo(-1);    // return -1
        assertThat(minStack.getMin()).isEqualTo(-1); // return -1
    }

}
