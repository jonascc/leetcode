package com.jonas.leetcode.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _20ValidParenthesesTest {

    @Test
    void test() {
        _20ValidParentheses validParentheses = new _20ValidParentheses();
        assertTrue(validParentheses.isValid("()"));
        assertTrue(validParentheses.isValid("[]"));
        assertTrue(validParentheses.isValid("{}"));
        assertTrue(validParentheses.isValid("()[]{}"));
        assertTrue(validParentheses.isValid("([])"));
        assertFalse(validParentheses.isValid("(]"));
        assertFalse(validParentheses.isValid("(])"));
        assertFalse(validParentheses.isValid("([)]"));
        assertTrue(validParentheses.isValid("(())"));
        assertTrue(validParentheses.isValid("([]{()})"));
    }

    @Test
    void test2() {
        _20ValidParentheses validParentheses = new _20ValidParentheses();
        assertTrue(validParentheses.isValid2("()"));
        assertTrue(validParentheses.isValid2("[]"));
        assertTrue(validParentheses.isValid2("{}"));
        assertTrue(validParentheses.isValid2("()[]{}"));
        assertTrue(validParentheses.isValid2("([])"));
        assertFalse(validParentheses.isValid2("(]"));
        assertFalse(validParentheses.isValid2("(])"));
        assertFalse(validParentheses.isValid2("([)]"));
        assertTrue(validParentheses.isValid2("(())"));
        assertTrue(validParentheses.isValid2("([]{()})"));
    }

    @Test
    void test3() {
        _20ValidParentheses validParentheses = new _20ValidParentheses();
        assertTrue(validParentheses.isValid3("()"));
        assertTrue(validParentheses.isValid3("[]"));
        assertTrue(validParentheses.isValid3("{}"));
        assertTrue(validParentheses.isValid3("()[]{}"));
        assertTrue(validParentheses.isValid3("([])"));
        assertFalse(validParentheses.isValid3("(]"));
        assertFalse(validParentheses.isValid3("(])"));
        assertFalse(validParentheses.isValid3("([)]"));
        assertTrue(validParentheses.isValid3("(())"));
        assertTrue(validParentheses.isValid3("([]{()})"));
        assertFalse(validParentheses.isValid3("([}}])"));
    }

    @Test
    void test4() {
        _20ValidParentheses validParentheses = new _20ValidParentheses();
        assertTrue(validParentheses.isValid4("()"));
        assertTrue(validParentheses.isValid4("[]"));
        assertTrue(validParentheses.isValid4("{}"));
        assertTrue(validParentheses.isValid4("()[]{}"));
        assertTrue(validParentheses.isValid4("([])"));
        assertFalse(validParentheses.isValid4("(]"));
        assertFalse(validParentheses.isValid4("(])"));
        assertFalse(validParentheses.isValid4("([)]"));
        assertTrue(validParentheses.isValid4("(())"));
        assertTrue(validParentheses.isValid4("([]{()})"));
        assertFalse(validParentheses.isValid4("([}}])"));
    }

}
