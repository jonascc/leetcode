package com.jonas.leetcode.dsa.scottbarrett.hashtable;

import java.util.*;

public class GroupAnagrams {

    static void main() {
        String[] strings = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strings));
    }

    public static List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strings) {
            char[] charArray = str.toLowerCase().toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            List<String> list = new ArrayList<>();
            if (map.containsKey(sortedStr)) {
                list = map.get(sortedStr);
                list.add(str);
            } else {
                list.add(str);
            }
            map.put(sortedStr, list);
        }
        List<List<String>> list = new ArrayList<>();
        for (Map.Entry<String, List<String>> m : map.entrySet()) {
            list.add(m.getValue());
        }
        return list;
    }

}
