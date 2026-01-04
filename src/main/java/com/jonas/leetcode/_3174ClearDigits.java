package com.jonas.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class _3174ClearDigits {

    public String clearDigits(String s) {
        char[] charArray = s.toCharArray();

        Deque<Character> stack = new ArrayDeque<>();
        for (char c : charArray) {
            switch (c) {
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> {
                    Character peek = stack.peek();
                    if (peek != null && (peek < '0' || peek > '9')) {
                        stack.remove();
                    }
                }
                default -> stack.push(c);
            }
        }
        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()) {
            str.insert(0, stack.pop());
        }
        return str.toString();
    }

}
