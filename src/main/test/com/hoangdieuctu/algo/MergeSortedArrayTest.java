package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArrayTest {

    @Test
    public void testCase1() {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {2, 5, 6};

        MergeSortedArray.merge(num1, 3, num2, 3);
        Assert.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, num1);
    }

    @Test
    public void testCase2() {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {4, 5, 6};

        MergeSortedArray.merge(num1, 3, num2, 3);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, num1);
    }

    @Test
    public void testCase3() {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {1, 2, 3};

        MergeSortedArray.merge(num1, 3, num2, 3);
        Assert.assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3}, num1);
    }

    @Test
    public void testCase4() {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {1, 1, 1};

        MergeSortedArray.merge(num1, 3, num2, 3);
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 2, 3}, num1);
    }

    @Test
    public void testCase5() {
        int[] num1 = {2, 3, 4, 0, 0, 0};
        int[] num2 = {1, 1, 1};

        MergeSortedArray.merge(num1, 3, num2, 3);
        Assert.assertArrayEquals(new int[]{1, 1, 1, 2, 3, 4}, num1);
    }
}
