package com.jonas.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _71SimplifyPathTest {

    @Test
    void simplifyPath() {
        _71SimplifyPath simplifyPath = new _71SimplifyPath();
        assertThat(simplifyPath.simplifyPath("/home/")).isEqualTo("/home");
        assertThat(simplifyPath.simplifyPath("/home//foo/")).isEqualTo("/home/foo");
        assertThat(simplifyPath.simplifyPath("/home/user/Documents/../Pictures")).isEqualTo("/home/user/Pictures");
        assertThat(simplifyPath.simplifyPath("/../")).isEqualTo("/");
        assertThat(simplifyPath.simplifyPath("/.../a/../b/c/../d/./")).isEqualTo("/.../b/d");
    }

}
