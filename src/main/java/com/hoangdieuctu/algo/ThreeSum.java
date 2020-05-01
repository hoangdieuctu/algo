package com.hoangdieuctu.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    static List<List<Integer>> find(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                if (k < nums.length -1 && nums[k] == nums[k + 1]) {
                    k--;
                    continue;
                }

                int value = nums[i] + nums[j] + nums[k];
                if (value < 0) {
                    j++;
                } else if (value > 0) {
                    k--;
                } else {
                    results.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
            }
        }

        return results;
    }
}
