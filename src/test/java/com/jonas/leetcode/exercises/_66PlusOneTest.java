package com.jonas.leetcode.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _66PlusOneTest {

    @Test
    void searchInsertPositionTest() {
        _66PlusOne plusOne = new _66PlusOne();
        assertArrayEquals(new int[]{1,2,4}, plusOne.plusOne(new int[]{1,2,3}));
        assertArrayEquals(new int[]{4,3,2,2}, plusOne.plusOne(new int[]{4,3,2,1}));
        assertArrayEquals(new int[]{1,0}, plusOne.plusOne(new int[]{9}));
        assertArrayEquals(new int[]{9,8,7,6,5,4,3,2,1,1}, plusOne.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0}));
        assertArrayEquals(new int[]{6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,4}, plusOne.plusOne(new int[]{6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3}));
    }

    @Test
    void searchInsertPositionTest2() {
        _66PlusOne plusOne = new _66PlusOne();
        assertArrayEquals(new int[]{1,2,4}, plusOne.plusOne2(new int[]{1,2,3}));
        assertArrayEquals(new int[]{4,3,2,2}, plusOne.plusOne2(new int[]{4,3,2,1}));
        assertArrayEquals(new int[]{1,0}, plusOne.plusOne2(new int[]{9}));
        assertArrayEquals(new int[]{9,8,7,6,5,4,3,2,1,1}, plusOne.plusOne2(new int[]{9,8,7,6,5,4,3,2,1,0}));
        assertArrayEquals(new int[]{6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,4}, plusOne.plusOne2(new int[]{6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3}));
    }

}
