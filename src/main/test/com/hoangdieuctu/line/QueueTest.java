package com.hoangdieuctu.line;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class QueueTest {


    private List<String> lines = Arrays.asList("OFFER hello", "OFFER word", "OFFER !", "TAKE", "SIZE");

    @Test
    public void test1() {
        String input = "5 2";

        String[] parts = input.split(" ");
        int n = Integer.parseInt(parts[0]);
        int size = Integer.parseInt(parts[1]);

        Queue queue = new Queue(size);

        for (int i = 0; i < n; i++) {
            String s = lines.get(i);
            if (s.startsWith("OFFER")) {
                String value = s.substring(6);
                boolean offer = queue.offer(value);
                System.out.println(offer);
            } else if (s.equals("TAKE")) {
                String take = queue.take();
                if (take != null) {
                    System.out.println(take);
                }
            } else if (s.equals("SIZE")) {
                System.out.println(queue.size());
            }
        }
    }

}
