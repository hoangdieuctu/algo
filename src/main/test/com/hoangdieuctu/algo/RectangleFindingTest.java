package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

public class RectangleFindingTest {

    @Test
    public void testCase1() {
        int[] coordinates = RectangleFinding.find(new int[][]{{1, 4}, {3, 4}, {3, 10}});
        Assert.assertEquals(2, coordinates.length);
        Assert.assertEquals(1, coordinates[0]);
        Assert.assertEquals(10, coordinates[1]);
    }

    @Test
    public void testCase2() {
        int[] coordinates = RectangleFinding.find(new int[][]{{2, 2}, {3, 2}, {3, 1}});
        Assert.assertEquals(2, coordinates.length);
        Assert.assertEquals(2, coordinates[0]);
        Assert.assertEquals(1, coordinates[1]);
    }

    @Test
    public void testCase3() {
        int[] coordinates = RectangleFinding.find(new int[][]{{1, 1}, {1,3}, {2, 3}});
        Assert.assertEquals(2, coordinates.length);
        Assert.assertEquals(2, coordinates[0]);
        Assert.assertEquals(1, coordinates[1]);
    }

    @Test
    public void testCase4() {
        int[] coordinates = RectangleFinding.find(new int[][]{{1, 1}, {1,3}, {4, 1}});
        Assert.assertEquals(2, coordinates.length);
        Assert.assertEquals(4, coordinates[0]);
        Assert.assertEquals(3, coordinates[1]);
    }
}
