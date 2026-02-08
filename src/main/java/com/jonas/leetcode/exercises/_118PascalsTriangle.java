package com.jonas.leetcode.exercises;

import java.util.ArrayList;
import java.util.List;

public class _118PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>(numRows);
        List<Integer> list0 = List.of(1);
        output.add(list0);
        for (int outputListIndex = 1; outputListIndex < numRows; outputListIndex++) {
            int pointer0 = -1;
            int pointer1 = 0;
            List<Integer> list = new ArrayList<>(outputListIndex + 1);
            List<Integer> previousList = output.get(outputListIndex - 1);
            for (int i = 0, previousListSize = previousList.size(); i <= previousListSize; i++) {
                int sum = 0;
                if (pointer0 >= 0) {
                    sum += previousList.get(pointer0);
                }
                if (pointer1 < previousListSize) {
                    sum += previousList.get(pointer1);
                }
                pointer0++;
                pointer1++;
                list.add(sum);
            }
            output.add(list);
        }
        return output;
    }

}
