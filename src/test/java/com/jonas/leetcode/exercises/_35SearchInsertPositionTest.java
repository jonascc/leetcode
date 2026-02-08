package com.jonas.leetcode.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _35SearchInsertPositionTest {

    @Test
    void searchInsertPositionTest() {
        _35SearchInsertPosition searchInsertPosition = new _35SearchInsertPosition();
        assertEquals(2, searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 5));
        assertEquals(1, searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 2));
        assertEquals(4, searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 7));
        assertEquals(0, searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 0));
    }

    @Test
    void searchInsertPositionTest2() {
        _35SearchInsertPosition searchInsertPosition = new _35SearchInsertPosition();
        assertEquals(2, searchInsertPosition.searchInsert2(new int[]{1,3,5,6}, 5));
        assertEquals(1, searchInsertPosition.searchInsert2(new int[]{1,3,5,6}, 2));
        assertEquals(4, searchInsertPosition.searchInsert2(new int[]{1,3,5,6}, 7));
        assertEquals(0, searchInsertPosition.searchInsert2(new int[]{1,3,5,6}, 0));
    }

}
