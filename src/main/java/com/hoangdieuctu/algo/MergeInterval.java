package com.hoangdieuctu.algo;

import java.util.*;
import java.util.stream.Collectors;

public class MergeInterval {

    static class Interval {
        int first;
        int last;

        public Interval(int first, int last) {
            this.first = first;
            this.last = last;
        }
    }

    static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        List<Interval> items = Arrays.stream(intervals).map(ele -> new Interval(ele[0], ele[1])).collect(Collectors.toList());
        items.sort(Comparator.comparing(i -> i.first));

        List<Interval> list = new ArrayList<>();

        Interval previous = items.get(0);
        for (int i = 1; i < items.size(); i++) {
            Interval current = items.get(i);
            if (previous.last >= current.first) {
                previous.last = Math.max(previous.last, current.last);
            } else {
                list.add(previous);
                previous = current;
            }
        }
        list.add(previous);


        int[][] results = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            results[i][0] = list.get(i).first;
            results[i][1] = list.get(i).last;
        }

        return results;
    }

    static int[][] merge1(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        LinkedList<int[]> results = new LinkedList<>();
        for (int[] interval : intervals) {
            if (results.isEmpty() || results.getLast()[1] < interval[0]) {
                results.add(interval);
            } else {
                results.getLast()[1] = Math.max(results.getLast()[1], interval[1]);
            }
        }

        return results.toArray(new int[results.size()][]);
    }

}
