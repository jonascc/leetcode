package com.jonas.leetcode.dsa.scottbarrett.hashtable;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    static void main() {
        System.out.println(firstNonRepeatingChar("lp"));
    }

    public static Character firstNonRepeatingChar(String str) {
        char[] charArray = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : charArray) {
            Integer value = map.get(c);
            if (value == null) {
                map.put(c, 1);
            } else {
                map.put(c, ++value);
            }
        }
        for (char c : charArray) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        return null;
    }

}
