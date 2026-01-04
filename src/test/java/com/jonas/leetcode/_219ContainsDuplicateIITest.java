package com.jonas.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _219ContainsDuplicateIITest {

    @Test
    void containsDuplicateII() {
        _219ContainsDuplicateII containsDuplicateII = new _219ContainsDuplicateII();
        assertThat(containsDuplicateII.containsNearbyDuplicate(new int[]{1,2,3,1}, 3)).isTrue();
        assertThat(containsDuplicateII.containsNearbyDuplicate(new int[]{1,0,1,1}, 1)).isTrue();
        assertThat(containsDuplicateII.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2)).isFalse();
    }

}
