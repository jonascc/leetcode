package com.jonas.leetcode.dsa.scottbarrett.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {

    static void main() {
        int[] nums = {-1, 0, 1, 0, -1, -1, 2, 2};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            Integer i1 = map.get(i);
            if (i1 == null) {
                map.put(i, 1);
            } else {
                map.put(i, ++i1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                list.add(entry.getKey());
            }
        }
        return list;
    }

}
