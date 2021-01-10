package com.hoangdieuctu.algo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallest {

    static int find(int[] arr, int k) {
        return find0(arr, k);
    }

    static int find0(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : arr) {
            queue.offer(i);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        return queue.peek();
    }
}
