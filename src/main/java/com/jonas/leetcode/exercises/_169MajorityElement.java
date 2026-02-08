package com.jonas.leetcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class _169MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxOcc = 0;
        int value = nums[0];
        for (int num : nums) {
            if (map.get(num) == null) {
                map.put(num, 1);

            } else {
                Integer val = map.get(num);
                map.replace(num, ++val);
                if (val > maxOcc) {
                    maxOcc = val;
                    value = num;
                }
            }
        }
        return value;
    }

}
