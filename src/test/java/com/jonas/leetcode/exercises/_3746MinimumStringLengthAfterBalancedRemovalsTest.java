package com.jonas.leetcode.exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _3746MinimumStringLengthAfterBalancedRemovalsTest {

    @Test
    void minimumStringLengthAfterBalancedRemovalsTest() {
        _3746MinimumStringLengthAfterBalancedRemovals obj = new _3746MinimumStringLengthAfterBalancedRemovals();
        assertThat(obj.minLengthAfterRemovals("aabbab")).isEqualTo(0);
        assertThat(obj.minLengthAfterRemovals("aaaa")).isEqualTo(4);
        assertThat(obj.minLengthAfterRemovals("aaabb")).isEqualTo(1);
    }

}
