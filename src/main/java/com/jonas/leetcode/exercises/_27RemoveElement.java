package com.jonas.leetcode.exercises;

public class _27RemoveElement {

    private static final int INVALID_VALUE = 51;

    public int removeElement(int[] nums, int val) {
        int valCount = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == val) {
                nums[i] = INVALID_VALUE;
                valCount++;
            }
        }
        int rotateCount = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] == INVALID_VALUE && length > 1) {
                int element = nums[i];
                for (int j = i; j < length - 1; j++) {
                    nums[j] = nums[j + 1];

                }
                nums[length - 1] = element;
                rotateCount++;
                if (nums[i] == INVALID_VALUE && rotateCount < valCount) {
                    i--;
                }
            }
        }
        return nums.length - valCount;
    }

    // from the internet
    public int removeElement2(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

}
