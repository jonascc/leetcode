package com.jonas.leetcode.exercises;

import java.util.ArrayDeque;
import java.util.Deque;

public class _3746MinimumStringLengthAfterBalancedRemovals {

    public int minLengthAfterRemovals(String s) {
        final char[] chars = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : chars) {
            if (stack.peek() != null && ((c == 'a' && stack.peek() == 'b') || (c == 'b' && stack.peek() == 'a'))) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.size();
    }

}
