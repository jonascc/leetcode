package com.jonas.leetcode.exercises;

import java.util.ArrayDeque;
import java.util.Deque;

public class _2000ReversePrefixOfWord {

    public String reversePrefix(String word, char ch) {
        char[] charArray = word.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        boolean flag = true;
        StringBuilder stb = new StringBuilder();
        StringBuilder stb2 = new StringBuilder();
        for (char c : charArray) {
            if (c == ch && flag) {
                stack.push(c);
                while (!stack.isEmpty()) {
                    stb.append(stack.pop());
                }
                flag = false;
            } else {
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            stb2.insert(0, stack.pop());
        }
        return stb.append(stb2).toString();
    }

}
