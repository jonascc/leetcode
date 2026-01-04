package com.jonas.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _217ContainsDuplicateTest {

    @Test
    void containsDuplicate() {
        _217ContainsDuplicate containsDuplicate = new _217ContainsDuplicate();
        assertThat(containsDuplicate.containsDuplicate(new int[]{1,2,3,1})).isTrue();
        assertThat(containsDuplicate.containsDuplicate(new int[]{1,2,3,4})).isFalse();
        assertThat(containsDuplicate.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2})).isTrue();
    }

}
