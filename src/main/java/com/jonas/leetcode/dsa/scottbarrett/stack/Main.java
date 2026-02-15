package com.jonas.leetcode.dsa.scottbarrett.stack;

public class Main {

    static void main() {
        StackArrayList<Integer> stack = new StackArrayList<>();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(1);

        stack.printStack();
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        StackArrayList<Character> stack = new StackArrayList<>();
        for (char c : charArray) {
            stack.push(c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }

// Reference implementation
//    public static String reverseString(String string) {
//        StackArrayList<Character> stack = new StackArrayList<>();
//        String reversedString = "";
//
//        for (char c : string.toCharArray()) {
//            stack.push(c);
//        }
//
//        while (!stack.isEmpty()) {
//            reversedString += stack.pop();
//        }
//
//        return reversedString;
//    }

    public static boolean isBalancedParentheses(String str) {
        char[] charArray = str.toCharArray();
        StackArrayList<Character> stack = new StackArrayList<>();
        for (char c : charArray) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

// Reference implementation
//    public static boolean isBalancedParentheses(String parentheses) {
//        StackArrayList<Character> stack = new StackArrayList<>();
//        for (char p : parentheses.toCharArray()) {
//            if (p == '(') {
//                stack.push(p);
//            } else if (p == ')') {
//                if (stack.isEmpty() || stack.pop() != '(') {
//                    return false;
//                }
//            }
//        }
//        return stack.isEmpty();
//    }

    public static void sortStack(StackArrayList<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        StackArrayList<Integer> tempStack = new StackArrayList<>();
        Integer temp = null;
        while (!stack.isEmpty()) {
            temp = stack.pop();
            if (tempStack.isEmpty()) {
                tempStack.push(temp);
            } else if (temp < tempStack.peek()) {
                while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                    stack.push(tempStack.pop());
                }
                tempStack.push(temp);
            } else {
                tempStack.push(temp);
            }
        }
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

// Reference implementation
//    public static void sortStack(StackArrayList<Integer> stack) {
//        StackArrayList<Integer> additionalStack = new StackArrayList<>();
//
//        while (!stack.isEmpty()) {
//            int temp = stack.pop();
//
//            while (!additionalStack.isEmpty() && additionalStack.peek() > temp) {
//                stack.push(additionalStack.pop());
//            }
//
//            additionalStack.push(temp);
//        }
//
//        while (!additionalStack.isEmpty()) {
//            stack.push(additionalStack.pop());
//        }
//    }

}
