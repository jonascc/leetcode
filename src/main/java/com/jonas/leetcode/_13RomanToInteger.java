package com.jonas.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _13RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);

        char[] charArray = s.toCharArray();
        int result = 0;

        for (int i = 0; i < charArray.length; i++) {
            Integer val = romanNumbers.get(charArray[i]);
            boolean isSpecialCase = false;
            char currentChar = charArray[i];
            char nextChar = '0';
            if (i < charArray.length - 1) {
                nextChar = charArray[i + 1];
            }
            if (currentChar == 'I' && nextChar == 'V') {
                result += 4;
                isSpecialCase = true;
            }
            if (currentChar == 'I' && nextChar == 'X') {
                result += 9;
                isSpecialCase = true;
            }
            if (currentChar == 'X' && nextChar == 'L') {
                result += 40;
                isSpecialCase = true;
            }
            if (currentChar == 'X' && nextChar == 'C') {
                result += 90;
                isSpecialCase = true;
            }
            if (currentChar == 'C' && nextChar == 'D') {
                result += 400;
                isSpecialCase = true;
            }
            if (currentChar == 'C' && nextChar == 'M') {
                result += 900;
                isSpecialCase = true;
            }
            if (isSpecialCase) {
                i++;
            } else {
                result += val;
            }
        }
        return result;
    }
}
