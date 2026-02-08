package com.jonas.leetcode.exercises;

public class _35SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        for (int i = 0, length = nums.length; i < length; i++) {
            if (i == 0 && nums[i] > target) {
                return i;
            } else if (nums[i] == target) {
                return i;
            } else if (i > 0 && target > nums[i - 1] && target < nums[i]) {
                return i;
            } else if (i == length -1) {
                return i + 1;
            }
        }
        return 0;
    }

    // from the internet (binary search)
    public int searchInsert2(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

}
