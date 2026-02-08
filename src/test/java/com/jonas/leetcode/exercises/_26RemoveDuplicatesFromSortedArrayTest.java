package com.jonas.leetcode.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _26RemoveDuplicatesFromSortedArrayTest {

    @Test
    void test() {
        _26RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new _26RemoveDuplicatesFromSortedArray();
        assertEquals(2, removeDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1, 2}));
        assertEquals(5, removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        assertEquals(5, removeDuplicatesFromSortedArray.removeDuplicates(new int[]{-1, 0, 1, 2, 3}));
    }

}
