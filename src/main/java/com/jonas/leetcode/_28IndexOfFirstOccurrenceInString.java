package com.jonas.leetcode;

public class _28IndexOfFirstOccurrenceInString {
    public int strStr(String haystack, String needle) {
         if (!haystack.contains(needle)) {
             return -1;
         }
         return haystack.indexOf(needle);
    }

    public int strStr2(String haystack, String needle) {
        if ("".equals(needle)) {
            return 0;
        }
        byte[] haystackBytes = haystack.getBytes();
        byte[] needleBytes = needle.getBytes();
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        if (needleLength > haystackLength) {
            return -1;
        }

        int i = 0;
        int j = -1;
        while (i < haystackLength) {
            if (!(needleBytes[++j] == haystackBytes[i] && j < needleLength)) {
                i = i - j;
                j = -1;
            }
            if (j == needleLength - 1) {
                return i - j;
            }
            i++;
        }
        return -1;
    }

}
