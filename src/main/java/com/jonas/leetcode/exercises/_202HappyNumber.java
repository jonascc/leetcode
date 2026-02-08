package com.jonas.leetcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class _202HappyNumber {

    public boolean isHappy(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int value = n;
        while (!map.containsValue(1)) {
            if (map.containsKey(value)) {
                return false;
            }
            int sumSqr = square(value);
            map.put(value, sumSqr);
            value = sumSqr;
        }
        return true;
    }

    public int square(int n) {
        int result = 0;
        while (n > 0) {
            int remainder = n % 10;
            result += remainder * remainder;
            n /= 10;
        }
        return result;
    }

}
