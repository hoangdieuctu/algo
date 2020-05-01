package com.hoangdieuctu.algo;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> results = new ArrayList<>();

        for (int[] interval : intervals) {
            if (interval[1] < newInterval[0]) {
                results.add(interval);
            } else if (interval[0] > newInterval[1]) {
                results.add(newInterval);
                newInterval = interval;
            } else {
                newInterval = new int[]{Math.min(interval[0], newInterval[0]), Math.max(interval[1], newInterval[1])};
            }
        }

        results.add(newInterval);

        return results.toArray(new int[results.size()][]);
    }
}
