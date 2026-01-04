package com.jonas.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _3174ClearDigitsTest {

    @Test
    void clearDigits() {
        _3174ClearDigits clearDigits = new _3174ClearDigits();
        assertThat(clearDigits.clearDigits("abc")).isEqualTo("abc");
        assertThat(clearDigits.clearDigits("cb34")).isEqualTo("");
    }

}
