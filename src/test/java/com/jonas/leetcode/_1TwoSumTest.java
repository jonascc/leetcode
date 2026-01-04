package com.jonas.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1TwoSumTest {

    @Test
    void twoSum() {
        _1TwoSum twoSum = new _1TwoSum();
        assertThat(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{0, 1});
        assertThat(twoSum.twoSum(new int[]{3, 2, 4}, 6)).isEqualTo(new int[]{1, 2});
        assertThat(twoSum.twoSum(new int[]{3, 3}, 6)).isEqualTo(new int[]{0, 1});
        assertThat(twoSum.twoSum(new int[]{2,5,5,11}, 10)).isEqualTo(new int[]{1, 2});
    }

    @Test
    void twoSum2() {
        _1TwoSum twoSum = new _1TwoSum();
        assertThat(twoSum.twoSum2(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{0, 1});
        assertThat(twoSum.twoSum2(new int[]{3, 2, 4}, 6)).isEqualTo(new int[]{1, 2});
        assertThat(twoSum.twoSum2(new int[]{3, 3}, 6)).isEqualTo(new int[]{0, 1});
        assertThat(twoSum.twoSum2(new int[]{2,5,5,11}, 10)).isEqualTo(new int[]{1, 2});
    }

    @Test
    void twoSum3() {
        _1TwoSum twoSum = new _1TwoSum();
        assertThat(twoSum.twoSum3(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{0, 1});
        assertThat(twoSum.twoSum3(new int[]{3, 2, 4}, 6)).isEqualTo(new int[]{1, 2});
        assertThat(twoSum.twoSum3(new int[]{3, 3}, 6)).isEqualTo(new int[]{0, 1});
        assertThat(twoSum.twoSum3(new int[]{2,5,5,11}, 10)).isEqualTo(new int[]{1, 2});
    }

}
