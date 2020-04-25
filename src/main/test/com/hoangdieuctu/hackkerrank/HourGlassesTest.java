package com.hoangdieuctu.hackkerrank;

import org.junit.Assert;
import org.junit.Test;

public class HourGlassesTest {

    @Test
    public void case1() {
        int arr[][] = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        Assert.assertEquals(19, HourGlasses.hourglassSum(arr));
    }

    @Test
    public void case2() {
        int arr[][] = new int[][]{
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        Assert.assertEquals(28, HourGlasses.hourglassSum(arr));
    }
}
