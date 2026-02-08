package com.jonas.leetcode.exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _28IndexOfFirstOccurrenceInStringTest {

    @Test
    void test() {
        _28IndexOfFirstOccurrenceInString indexOfFirstOccurrenceInString = new _28IndexOfFirstOccurrenceInString();
        assertThat(indexOfFirstOccurrenceInString.strStr("sadbutsad", "sad")).isEqualTo(0);
        assertThat(indexOfFirstOccurrenceInString.strStr("leetcode", "leeto")).isEqualTo(-1);
    }

    @Test
    void test2() {
        _28IndexOfFirstOccurrenceInString indexOfFirstOccurrenceInString = new _28IndexOfFirstOccurrenceInString();
        assertThat(indexOfFirstOccurrenceInString.strStr2("mississippi", "issi")).isEqualTo(1);
        assertThat(indexOfFirstOccurrenceInString.strStr2("mississippi", "issip")).isEqualTo(4);
        assertThat(indexOfFirstOccurrenceInString.strStr2("sadbutsad", "sad")).isEqualTo(0);
        assertThat(indexOfFirstOccurrenceInString.strStr2("hello", "ll")).isEqualTo(2);
        assertThat(indexOfFirstOccurrenceInString.strStr2("leetcode", "leeto")).isEqualTo(-1);
    }

}
