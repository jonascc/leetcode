package com.jonas.leetcode.exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1717MaximumScoreFromRemovingSubstringsTest {

    @Test
    void maximumScoreFromRemovingSubstringsTest() {
        _1717MaximumScoreFromRemovingSubstrings obj = new _1717MaximumScoreFromRemovingSubstrings();
        assertThat(obj.maximumGain("cdbcbbaaabab", 4, 5)).isEqualTo(19);
        assertThat(obj.maximumGain("aabbaaxybbaabb", 5, 4)).isEqualTo(20);
    }

}
