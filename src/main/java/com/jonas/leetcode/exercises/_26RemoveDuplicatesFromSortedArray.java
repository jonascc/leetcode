package com.jonas.leetcode.exercises;

public class _26RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        for (int i = 0, j = 0; i < length; i++) {
            if (i == 0) {
                j++;
                continue;
            }
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
            while (i == length - 1 && j <= length - 1) {
                nums[j] = 101;
                j++;
            }
        }

        for (int k = 0; k < length; k++) {
            if (nums[k] == 101) {
                return k;
            } else if (k == length - 1 && nums[k] != 101) {
                return k + 1;
            }
        }
        return 0;
    }

}
