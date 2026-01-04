package com.jonas.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = map.get(target - nums[i]);
            if (complementIndex != null && i != complementIndex) {
                return new int[]{i, complementIndex};
            }
        }
        return new int[]{};
    }

    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = map.get(target - nums[i]);
            if (complementIndex != null && i != complementIndex) {
                return new int[]{complementIndex, i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

}
