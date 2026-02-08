package com.jonas.leetcode.exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _9PalindromeNumberTest {

    @Test
    void test() {
        _9PalindromeNumber _9PalindromeNumber = new _9PalindromeNumber();
        assertThat(_9PalindromeNumber.isPalindrome(121)).isTrue();
        assertThat(_9PalindromeNumber.isPalindrome(-121)).isFalse();
        assertThat(_9PalindromeNumber.isPalindrome(10)).isFalse();
    }

    @Test
    void test2() {
        _9PalindromeNumber _9PalindromeNumber = new _9PalindromeNumber();
        assertThat(_9PalindromeNumber.isPalindrome2(121)).isTrue();
        assertThat(_9PalindromeNumber.isPalindrome2(-121)).isFalse();
        assertThat(_9PalindromeNumber.isPalindrome2(10)).isFalse();
        assertThat(_9PalindromeNumber.isPalindrome2(1234567899)).isFalse();
    }

}
