package com.jonas.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _14LongestCommonPrefixTest {

    @Test
    void test() {
        _14LongestCommonPrefix longestCommonPrefix = new _14LongestCommonPrefix();
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"reflower","flow","flight"}));
    }

}
