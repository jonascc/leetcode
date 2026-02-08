package com.jonas.leetcode.exercises;

public class _14LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        int lengthShortestStr = Integer.MAX_VALUE;
        String shortestStr = "";
        for (String str : strs) {
            if (str.length() < lengthShortestStr) {
                lengthShortestStr = str.length();
                shortestStr = str;
            }
        }

        String commonPrefix = "";
        for (int i = lengthShortestStr; i > 0; i--) {
            if (!commonPrefix.isEmpty()) {
                return commonPrefix;
            }
            shortestStr = shortestStr.substring(0, i);
            for (String str : strs) {
                if (str.startsWith(shortestStr)) {
                    commonPrefix = shortestStr;
                } else {
                    commonPrefix = "";
                    break;
                }
            }
        }
        return commonPrefix;
    }

}
