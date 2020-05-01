package com.hoangdieuctu.algo;

public class RectangleFinding {
    static int[] find(int[][] arrs) {
        int f = arrs[0][0] == arrs[1][0] ? arrs[2][0] : arrs[1][0] == arrs[2][0] ? arrs[0][0] : arrs[1][0];
        int s = arrs[0][1] == arrs[1][1] ? arrs[2][1] : arrs[1][1] == arrs[2][1] ? arrs[0][1] : arrs[1][1];

        return new int[]{f, s};
    }
}
