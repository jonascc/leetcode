package com.jonas.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class _71SimplifyPath {

    public String simplifyPath(String path) {
        String[] split = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for (String str : split) {
            if (str.isEmpty() || str.equals(".")) {
                continue;
            } else if (str.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(str);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, "/" + stack.pop());
        }
        return sb.isEmpty() ? "/" : sb.toString();
    }

}
