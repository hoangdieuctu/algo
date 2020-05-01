package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumIITest {

    @Test
    public void testCase1() {
        int[] results = TwoSumII.find(new int[]{2, 7, 11, 15}, 9);
        Assert.assertEquals(2, results.length);
        Assert.assertArrayEquals(new int[]{1, 2}, results);
    }

}
