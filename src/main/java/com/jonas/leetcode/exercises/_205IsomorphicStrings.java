package com.jonas.leetcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class _205IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        final char[] charsS = s.toCharArray();
        final char[] charsT = t.toCharArray();
        if (charsS.length != charsT.length) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>(charsS.length);
        Map<Character, Character> revertMap = new HashMap<>(charsS.length);
        for (int i = 0, length = charsS.length; i < length; i++) {
            final Character previousChar = map.put(charsS[i], charsT[i]);
            final Character revertPreviousChar = revertMap.put(charsT[i], charsS[i]);
            final char cs = charsS[i];
            final char ct = charsT[i];
            if (previousChar != null && previousChar != ct || (revertPreviousChar != null && revertPreviousChar != cs)) {
                return false;
            }
        }
        return true;
    }

}
