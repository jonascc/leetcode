package com.jonas.leetcode.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _12IntegerToRoman {

    public String intToRoman(int num) {
        if (num < 1 || num > 3999) {
            throw new IllegalArgumentException("number is less than 1 or greater than 3999.");
        }
        Map<Integer, String> romanValues = getIntegerStringMap();

        List<Integer> integers = intToListInteger(num);
        StringBuilder result = new StringBuilder();
        for (int i = integers.size() - 1; i >= 0; i--) {
            Integer val = integers.get(i);
            double pow = Math.pow(10, i);
            if (val == 4 || val == 5 || val == 9) {
                result.append(romanValues.get((int) (pow * val)));
            } else if (val <= 3) {
                String letter = romanValues.get((int) pow);
                for (int j = 1; j <= val; j++) {
                    result.append(letter);
                }
            } else {
                result.append(romanValues.get((int) (pow * 5)));
                for (int k = 1; k <= val - 5; k++) {
                    result.append(romanValues.get((int) pow));
                }
            }
        }
        return result.toString();
    }

    private Map<Integer, String> getIntegerStringMap() {
        Map<Integer, String> romanValues = new HashMap<>();
        romanValues.put(1, "I");
        romanValues.put(4, "IV");
        romanValues.put(5, "V");
        romanValues.put(9, "IX");
        romanValues.put(10, "X");
        romanValues.put(40, "XL");
        romanValues.put(50, "L");
        romanValues.put(90, "XC");
        romanValues.put(100, "C");
        romanValues.put(400, "CD");
        romanValues.put(500, "D");
        romanValues.put(900, "CM");
        romanValues.put(1000, "M");
        return romanValues;
    }

    public List<Integer> intToListInteger(int num) {
        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            int remainder = num % 10;
            list.add(remainder);
            num = num - remainder;
            num /= 10;
            if (num == 0) {
                return list;
            }
        }
        return list;
    }

}
