package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

public class InsertIntervalTest {

    /**
     * middle-overlap
     */
    @Test
    public void testCase1() {
        int[][] arrs = {
                {1, 2},
                {3, 5},
                {6, 7},
                {8, 10},
                {12, 16}
        };

        int[] insert = {4, 9};

        int[][] results = InsertInterval.insert(arrs, insert);
        Assert.assertEquals(3, results.length);
        Assert.assertArrayEquals(new int[]{1, 2}, results[0]);
        Assert.assertArrayEquals(new int[]{3, 10}, results[1]);
        Assert.assertArrayEquals(new int[]{12, 16}, results[2]);
    }

    /**
     * start
     */
    @Test
    public void testCase2() {
        int[][] arrs = {
                {3, 5},
                {12, 16}
        };

        int[] insert = {1, 2};

        int[][] results = InsertInterval.insert(arrs, insert);
        Assert.assertEquals(3, results.length);
        Assert.assertArrayEquals(new int[]{1, 2}, results[0]);
        Assert.assertArrayEquals(new int[]{3, 5}, results[1]);
        Assert.assertArrayEquals(new int[]{12, 16}, results[2]);
    }

    /**
     * start-overlap
     */
    @Test
    public void testCase3() {
        int[][] arrs = {
                {3, 5},
                {12, 16}
        };

        int[] insert = {1, 4};

        int[][] results = InsertInterval.insert(arrs, insert);
        Assert.assertEquals(2, results.length);
        Assert.assertArrayEquals(new int[]{1, 5}, results[0]);
        Assert.assertArrayEquals(new int[]{12, 16}, results[1]);
    }

    /**
     * start-end
     */
    @Test
    public void testCase4() {
        int[][] arrs = {
                {3, 5},
                {12, 16}
        };

        int[] insert = {1, 20};

        int[][] results = InsertInterval.insert(arrs, insert);
        Assert.assertEquals(1, results.length);
        Assert.assertArrayEquals(new int[]{1, 20}, results[0]);
    }

    /**
     * middle-end
     */
    @Test
    public void testCase5() {
        int[][] arrs = {
                {1, 2},
                {3, 5},
                {6, 7},
                {8, 10},
                {12, 16}
        };

        int[] insert = {4, 20};

        int[][] results = InsertInterval.insert(arrs, insert);
        Assert.assertEquals(2, results.length);
        Assert.assertArrayEquals(new int[]{1, 2}, results[0]);
        Assert.assertArrayEquals(new int[]{3, 20}, results[1]);
    }

    /**
     * middle
     */
    @Test
    public void testCase6() {
        int[][] arrs = {
                {1, 2},
                {12, 16}
        };

        int[] insert = {6, 9};

        int[][] results = InsertInterval.insert(arrs, insert);
        Assert.assertEquals(3, results.length);
        Assert.assertArrayEquals(new int[]{1, 2}, results[0]);
        Assert.assertArrayEquals(new int[]{6, 9}, results[1]);
        Assert.assertArrayEquals(new int[]{12, 16}, results[2]);
    }

    /**
     * end
     */
    @Test
    public void testCase7() {
        int[][] arrs = {
                {1, 2},
                {12, 16}
        };

        int[] insert = {20, 30};

        int[][] results = InsertInterval.insert(arrs, insert);
        Assert.assertEquals(3, results.length);
        Assert.assertArrayEquals(new int[]{1, 2}, results[0]);
        Assert.assertArrayEquals(new int[]{12, 16}, results[1]);
        Assert.assertArrayEquals(new int[]{20, 30}, results[2]);
    }

    @Test
    public void testCase8() {
        int[][] arrs = {
                {1, 2},
                {12, 16}
        };

        int[] insert = {2, 12};

        int[][] results = InsertInterval.insert(arrs, insert);
        Assert.assertEquals(1, results.length);
        Assert.assertArrayEquals(new int[]{1, 16}, results[0]);
    }
}
