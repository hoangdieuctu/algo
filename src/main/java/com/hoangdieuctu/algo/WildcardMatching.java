package com.hoangdieuctu.algo;

public class WildcardMatching {

    static boolean match(String s, String p) {
        int i = 0;
        int j = 0;

        int jIndex = -1;
        int iIndex = -1;

        while (i < s.length()) {
            if (j < p.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')) {
                i++;
                j++;
            } else if (j < p.length() && p.charAt(j) == '*') {
                jIndex = j;
                iIndex = i;
                j++;
            } else if (jIndex != -1) {
                j = jIndex + 1;
                i = ++iIndex;
            } else {
                return false;
            }
        }

        while (j < p.length() && p.charAt(j) == '*') {
            j++;
        }

        return j == p.length();
    }

}
