package com.hoangdieuctu.algo;

import java.util.PriorityQueue;

public class KthLargest {

    static int find(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i : arr) {
            queue.offer(i);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        return queue.peek();
    }

}
