package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

public class MergeIntervalTest {

    @Test
    public void testCase1() {
        int[][] merged = MergeInterval.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        Assert.assertEquals(1, merged[0][0]);
        Assert.assertEquals(6, merged[0][1]);
        Assert.assertEquals(8, merged[1][0]);
        Assert.assertEquals(10, merged[1][1]);
        Assert.assertEquals(15, merged[2][0]);
        Assert.assertEquals(18, merged[2][1]);
    }

    @Test
    public void testCase2() {
        int[][] merged = MergeInterval.merge1(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        Assert.assertEquals(1, merged[0][0]);
        Assert.assertEquals(6, merged[0][1]);
        Assert.assertEquals(8, merged[1][0]);
        Assert.assertEquals(10, merged[1][1]);
        Assert.assertEquals(15, merged[2][0]);
        Assert.assertEquals(18, merged[2][1]);
    }
}
