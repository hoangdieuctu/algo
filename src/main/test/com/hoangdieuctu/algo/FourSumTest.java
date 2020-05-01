package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FourSumTest {

    @Test
    public void testCase1() {
        List<List<Integer>> results = FourSum.find(new int[]{1, 0, -1, 0, -2, 2}, 0);

        Assert.assertEquals(3, results.size());
        Assert.assertTrue(results.contains(Arrays.asList(-1, 0, 0, 1)));
        Assert.assertTrue(results.contains(Arrays.asList(-2, -1, 1, 2)));
        Assert.assertTrue(results.contains(Arrays.asList(-2, 0, 0, 2)));
    }

    @Test
    public void testCase2() {
        List<List<Integer>> results = FourSum.find(new int[]{0, 0, 0, 0}, 0);
        Assert.assertEquals(1, results.size());
        Assert.assertEquals(0, results.get(0).get(0), 0);
        Assert.assertEquals(0, results.get(0).get(1), 0);
        Assert.assertEquals(0, results.get(0).get(2), 0);
    }

    @Test
    public void testCase3() {
        List<List<Integer>> results = FourSum.find(new int[]{-2, 0, 0, 2, 2}, 0);
        Assert.assertEquals(1, results.size());
    }

    @Test
    public void testCase4() {
        List<List<Integer>> results = FourSum.find(new int[]{-3, -2, -1, 0, 0, 1, 2, 3}, 0);
        Assert.assertEquals(8, results.size());
    }

    @Test
    public void testCase5() {
        List<List<Integer>> results = FourSum.find(new int[]{-1, 0, -5, -2, -2, -4, 0, 1, -2}, -9);
        Assert.assertEquals(4, results.size());
    }
}
