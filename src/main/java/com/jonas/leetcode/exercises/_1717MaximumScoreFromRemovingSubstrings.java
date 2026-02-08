package com.jonas.leetcode.exercises;

import java.util.ArrayDeque;
import java.util.Deque;

public class _1717MaximumScoreFromRemovingSubstrings {

    public int maximumGain(String s, int x, int y) {
        char[] chars = s.toCharArray();
        char priority;
        char other;
        int sum = 0;
        int greater;
        int least;
        if (x > y) {
            priority = 'a';
            other = 'b';
            greater = x;
            least = y;
        } else {
            priority = 'b';
            other = 'a';
            greater = y;
            least = x;
        }
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : chars) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else if (stack.peek() != null && (c == other && stack.peek() == priority)) {
                stack.pop();
                sum += greater;
            } else {
                stack.push(c);
            }
        }

        StringBuilder stb = new StringBuilder();
        while (!stack.isEmpty()) {
            stb.insert(0, stack.pop());
        }

        chars = stb.toString().toCharArray();

        for (char c : chars) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else if (stack.peek() != null && (c == priority && stack.peek() == other)) {
                stack.pop();
                sum += least;
            } else {
                stack.push(c);
            }
        }

        return sum;
    }

}
