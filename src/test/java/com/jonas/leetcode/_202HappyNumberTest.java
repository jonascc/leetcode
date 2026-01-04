package com.jonas.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _202HappyNumberTest {

    @Test
    void happyNumber() {
        _202HappyNumber happyNumber = new _202HappyNumber();
        assertThat(happyNumber.isHappy(19)).isTrue();
        assertThat(happyNumber.isHappy(2)).isFalse();
    }

}
