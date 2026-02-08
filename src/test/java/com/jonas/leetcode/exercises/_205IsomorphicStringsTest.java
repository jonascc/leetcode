package com.jonas.leetcode.exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _205IsomorphicStringsTest {

    @Test
    void isomorphicStrings() {
        _205IsomorphicStrings isomorphicStrings = new _205IsomorphicStrings();
        assertThat(isomorphicStrings.isIsomorphic("egg", "add")).isTrue();
        assertThat(isomorphicStrings.isIsomorphic("foo", "bar")).isFalse();
        assertThat(isomorphicStrings.isIsomorphic("paper", "title")).isTrue();
    }

}
