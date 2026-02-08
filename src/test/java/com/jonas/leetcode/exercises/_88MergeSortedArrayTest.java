package com.jonas.leetcode.exercises;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _88MergeSortedArrayTest {

    _88MergeSortedArray mergeSortedArray = Mockito.spy(_88MergeSortedArray.class);

    @Test
    void searchInsertPositionTest() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        Mockito.doAnswer(invocation -> {
            // Access the argument at index 0 (or other indices as needed)
            int[] paramValue = invocation.getArgument(0);
            assertArrayEquals(new int[]{1,2,2,3,5,6}, paramValue); // Store the value for verification
            // You can also assert directly here if needed
            // Assertions.assertThat(paramValØue).isEqualTo("expectedValue");
            return null; // For void methods, return null
        }).when(mergeSortedArray).merge(new int[]{1,2,2,3,5,6}, 3, new int[]{2,5,6}, 3);

        mergeSortedArray.merge(nums1, 3, nums2, 3);
        mergeSortedArray.merge(nums1, 3, nums2, 3);// the second time it calls the method, nums1 will be {1,2,2,3,5,6}
    }

}
