package com.hoangdieuctu.algo;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    static boolean isomorphic(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char ac = a.charAt(i);
            char bc = b.charAt(i);

            if (map1.containsKey(ac)) {
                if (map1.get(ac) != bc) {
                    return false;
                }
            } else {
                if(map2.containsKey(bc)) {
                    return false;
                }
                map1.put(ac, bc);
                map2.put(bc, ac);
            }
        }

        return true;
    }

}
