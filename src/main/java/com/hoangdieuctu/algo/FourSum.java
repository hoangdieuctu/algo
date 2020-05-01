package com.hoangdieuctu.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    static List<List<Integer>> find(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int m = j + 1;
                int n = nums.length - 1;

                while (m < n) {
                    int value = nums[i] + nums[j] + nums[m] + nums[n];
                    if (value < target) {
                        m++;
                    } else if (value > target) {
                        n--;
                    } else {
                        List<Integer> items = Arrays.asList(nums[i], nums[j], nums[m], nums[n]);
                        results.add(items);

                        m++;
                        n--;

                        while (m < n && nums[n] == nums[n + 1]) {
                            n--;
                        }

                        while (m < n && nums[m] == nums[m - 1]) {
                            m++;
                        }
                    }
                }
            }
        }

        return results;
    }

}
