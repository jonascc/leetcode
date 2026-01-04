package com.jonas.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _27RemoveElementTest {

    @Test
    void removeElementTest() {
        _27RemoveElement removeElement = new _27RemoveElement();
        assertEquals(2, removeElement.removeElement(new int[]{3,2,2,3}, 3));
        assertEquals(5, removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
        assertEquals(0, removeElement.removeElement(new int[]{1}, 1));
    }

    @Test
    void removeElementTest2() {
        _27RemoveElement removeElement = new _27RemoveElement();
        assertEquals(2, removeElement.removeElement2(new int[]{3,2,2,3}, 3));
        assertEquals(5, removeElement.removeElement2(new int[]{0,1,2,2,3,0,4,2}, 2));
        assertEquals(0, removeElement.removeElement2(new int[]{1}, 1));
    }

}
