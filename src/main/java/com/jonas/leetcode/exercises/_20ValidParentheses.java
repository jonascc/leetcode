package com.jonas.leetcode.exercises;

import java.util.*;

public class _20ValidParentheses {

    public static void main(String[] args) {
        _20ValidParentheses validParentheses = new _20ValidParentheses();
        validParentheses.isValid("()");
    }

    public boolean isValid(String s) {
        final char[] charArray = s.toCharArray();
        if (charArray.length % 2 != 0) {
            return false;
        }
        if (charArray[0] == ')' || charArray[0] == ']' || charArray[0] == '}') {
            return false;
        }
        List<Character> list = new ArrayList<>();
        Map<Integer, Character> map = new TreeMap<>();
        for (int i = 0; i < charArray.length; i++) {
            list.add(charArray[i]);
            map.put(i, charArray[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == ')' && list.get(i - 1) == '(' ||
                    list.get(i) == ']' && list.get(i - 1) == '[' ||
                    list.get(i) == '}' && list.get(i - 1) == '{') {
                list.remove(i);
                list.remove(i - 1);
                i = 0;
            }
        }
        return list.isEmpty();
    }

    public boolean isValid2(String s) {
        final char[] charArray = s.toCharArray();
        if (charArray.length % 2 != 0) {
            return false;
        }
        if (charArray[0] == ')' || charArray[0] == ']' || charArray[0] == '}') {
            return false;
        }
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            list.add(charArray[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            int previousNonZeroIndex = 0;
            if (i > 0) {
                for (int k = i - 1; k > 0; k--) {
                    if (list.get(k) != '0') {
                        previousNonZeroIndex = k;
                        break;
                    }
                }
            }
            if (list.get(i) == ')' && list.get(previousNonZeroIndex) == '(' ||
                    list.get(i) == ']' && list.get(previousNonZeroIndex) == '[' ||
                    list.get(i) == '}' && list.get(previousNonZeroIndex) == '{') {
                list.set(i, '0');
                list.set(previousNonZeroIndex, '0');
            }
        }
        boolean validReturn = false;
        for (Character processedChar : list) {
            if (processedChar == '0') {
                validReturn = true;
            } else {
                validReturn = false;
                break;
            }
        }
        return validReturn;
    }

    public boolean isValid3(String s) {
        final char[] charArray = s.toCharArray();
        if (charArray.length % 2 != 0) {
            return false;
        }
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : charArray) {
            if (c == '(') {
                stack.addFirst(')');
            } else if (c == '[') {
                stack.addFirst(']');
            } else if (c == '{') {
                stack.addFirst('}');
            } else if (stack.isEmpty() || stack.removeFirst() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid4(String s) {
        char[] charArray = s.toCharArray();

        if (charArray.length % 2 != 0) {
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();
        for (char c : charArray) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (stack.peek() == null) {
                stack.push(c);
            } else if (c == ')' && stack.peek() != '(') {
                return false;
            } else if (c == ']' && stack.peek() != '[') {
                return false;
            } else if (c == '}' && stack.peek() != '{') {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

}
