package com.jonas.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _13RomanToIntegerTest {

    @Test
    void romanToIntegerTest() {
        _13RomanToInteger romanToInteger = new _13RomanToInteger();
        assertThat(romanToInteger.romanToInt("III")).isEqualTo(3);
        assertThat(romanToInteger.romanToInt("LVIII")).isEqualTo(58);
        assertThat(romanToInteger.romanToInt("MCMXCIV")).isEqualTo(1994);
    }

}
