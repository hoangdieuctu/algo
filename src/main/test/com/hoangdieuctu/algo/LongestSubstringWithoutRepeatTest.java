package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatTest {

    @Test
    public void testCase1() {
        Assert.assertEquals(3, LongestSubstringWithoutRepeat.find("abcabcbb"));
    }

    @Test
    public void testCase2() {
        Assert.assertEquals(3, LongestSubstringWithoutRepeat.find("pwwkew"));
    }

    @Test
    public void testCase3() {
        Assert.assertEquals(5, LongestSubstringWithoutRepeat.find("tmmzuxt"));
    }
}
