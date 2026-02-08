package com.jonas.leetcode.exercises;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _118PascalsTriangleTest {

    @Test
    void pascalsTriangle() {
        _118PascalsTriangle pascalsTriangle = new _118PascalsTriangle();
        assertThat(pascalsTriangle.generate(5)).isEqualTo(List.of(List.of(1), List.of(1,1), List.of(1,2,1), List.of(1,3,3,1), List.of(1,4,6,4,1)));
        assertThat(pascalsTriangle.generate(1)).isEqualTo(List.of(List.of(1)));
    }

}
