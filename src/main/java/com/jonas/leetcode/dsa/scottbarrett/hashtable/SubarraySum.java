package com.jonas.leetcode.dsa.scottbarrett.hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubarraySum {

    static void main() {
//        int[] nums = {1, 2, 3, 4, 5};
        int[] nums = {2, 3, 4, 5, 1};
        int target = 9;
        System.out.println(Arrays.toString(subarraySum(nums, target)));
    }

    public static int[] subarraySum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;
        map.put(0, -1);// edge case for when the range starts from index 0;
        for (int i = 0, length = nums.length; i < length; i++) {
            int value = nums[i];
            currentSum += value;
            int diff = currentSum - target;
            if (!map.containsKey(diff)) {
                map.put(currentSum, i);
            } else {
                return new int[]{map.get(diff) + 1, i};
            }
        }
        return new int[]{};
    }

// Reference implementation
//    public static int[] subarraySum(int[] nums, int target) {
//        Map<Integer, Integer> sumIndex = new HashMap<>();
//        sumIndex.put(0, -1);
//        int currentSum = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            currentSum += nums[i];
//            if (sumIndex.containsKey(currentSum - target)) {
//                return new int[]{sumIndex.get(currentSum - target) + 1, i};
//            }
//            sumIndex.put(currentSum, i);
//        }
//
//        return new int[]{};
//    }

}
