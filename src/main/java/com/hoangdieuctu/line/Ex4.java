package com.hoangdieuctu.line;

import java.util.Arrays;

public class Ex4 {

    static int[] find(int[] arrs, int target) {
        Arrays.sort(arrs); // O(n log n)

        int i = 0;
        int j = arrs.length - 1;

        // Complexity is O(n)
        while (i < j) {
            int val = arrs[i] + arrs[j];
            if (val > target) {
                j--;
            } else if (val < target) {
                i++;
            } else {
                return new int[]{arrs[i], arrs[j]};
            }
        }

        return new int[]{};
    }

}
