package com.jonas.leetcode.exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _2000ReversePrefixOfWordTest {

    @Test
    void reversePrefixOfWord() {
        _2000ReversePrefixOfWord reversePrefixOfWord = new _2000ReversePrefixOfWord();
        assertThat(reversePrefixOfWord.reversePrefix("abcdefd", 'd')).isEqualTo("dcbaefd");
        assertThat(reversePrefixOfWord.reversePrefix("xyxzxe", 'z')).isEqualTo("zxyxxe");
        assertThat(reversePrefixOfWord.reversePrefix("abcd", 'z')).isEqualTo("abcd");
    }

}
