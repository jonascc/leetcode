package com.jonas.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _169MajorityElementTest {

    @Test
    void majorityElement() {
        _169MajorityElement majorityElement = new _169MajorityElement();
        assertThat(majorityElement.majorityElement(new int[]{3,2,3})).isEqualTo(3);
        assertThat(majorityElement.majorityElement(new int[]{2,2,1,1,1,2,2})).isEqualTo(2);
    }

}
