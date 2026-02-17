package com.jonas.leetcode.dsa.scottbarrett.hashtable;

import java.util.HashMap;

public class ItemInCommon {

    static void main() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 3};
        System.out.println(itemInCommon(array1, array2));
    }

    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i : array1) {
            map.put(i, true);
        }
        for (int i : array2) {
            if (map.get(i) != null) {
                return true;
            }
        }
        return false;
    }

}
