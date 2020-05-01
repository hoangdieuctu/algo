package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ThreeSumTest {

    @Test
    public void testCase1() {
        List<List<Integer>> results = ThreeSum.find(new int[]{-1, 0, 1, 2, -1, -4});// -4 -1 -1 0 1 2
        Assert.assertEquals(2, results.size());
        Assert.assertEquals(-1, results.get(0).get(0), 0);
        Assert.assertEquals(-1, results.get(0).get(1), 0);
        Assert.assertEquals(2, results.get(0).get(2), 0);

        Assert.assertEquals(-1, results.get(1).get(0), 0);
        Assert.assertEquals(0, results.get(1).get(1), 0);
        Assert.assertEquals(1, results.get(1).get(2), 0);
    }

    @Test
    public void testCase2() {
        List<List<Integer>> results = ThreeSum.find(new int[]{0, 0, 0, 0});
        Assert.assertEquals(1, results.size());
        Assert.assertEquals(0, results.get(0).get(0), 0);
        Assert.assertEquals(0, results.get(0).get(1), 0);
        Assert.assertEquals(0, results.get(0).get(2), 0);
    }

    @Test
    public void testCase3() {
        List<List<Integer>> results = ThreeSum.find(new int[]{-2, 0, 1, 1, 2});
        Assert.assertEquals(2, results.size());
    }

    @Test
    public void testCase4() {
        List<List<Integer>> results = ThreeSum.find(new int[]{-2, 0, 0, 2, 2});
        Assert.assertEquals(1, results.size());
    }
}
