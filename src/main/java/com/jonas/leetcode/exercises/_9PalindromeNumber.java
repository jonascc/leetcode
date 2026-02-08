package com.jonas.leetcode.exercises;

public class _9PalindromeNumber {
    public boolean isPalindrome(int x) {
        String originalStr = String.valueOf(x);
        char[] originalCharArray = originalStr.toCharArray();
        StringBuilder strBuilder = new StringBuilder();
        for (int i = originalCharArray.length - 1; i >= 0; i--) {
            strBuilder.append(originalCharArray[i]);
        }
        return strBuilder.toString().equals(originalStr);
    }

    public boolean isPalindrome2(int x) {
        if (x >= 0) {
            int originalValue = x;
            int remainder;
            int result;
            StringBuilder reverseNumberStr = new StringBuilder();
            do {
                remainder = x % 10;
                result = x / 10;
                x = result;
                reverseNumberStr.append(remainder);
            } while (result > 0);
            int reverseNumber;
            try {
                reverseNumber = Integer.parseInt(reverseNumberStr.toString());
            } catch (NumberFormatException ex) {
                return false;
            }
            return reverseNumber - originalValue == 0;
        }
        return false;
    }
}
