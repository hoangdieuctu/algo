package com.hoangdieuctu.algo;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeat {

    static int find(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int result = 0;
        int count = 0;
        int marker = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                Integer index = map.remove(c);

                if (index >= marker) {
                    result = Math.max(result, count);
                    count = i - index;
                    marker = index;
                } else {
                    count++;
                }
                map.put(c, i);
            } else {
                map.put(c, i);
                count++;
            }
        }

        return Math.max(result, count);
    }

}
