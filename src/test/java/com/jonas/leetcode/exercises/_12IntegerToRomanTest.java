package com.jonas.leetcode.exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _12IntegerToRomanTest {

    @Test
    void integerToRomanTest() {
        _12IntegerToRoman integerToRoman = new _12IntegerToRoman();
        assertThat(integerToRoman.intToRoman(3749)).isEqualTo("MMMDCCXLIX");
        assertThat(integerToRoman.intToRoman(58)).isEqualTo("LVIII");
        assertThat(integerToRoman.intToRoman(1994)).isEqualTo("MCMXCIV");
    }

}
