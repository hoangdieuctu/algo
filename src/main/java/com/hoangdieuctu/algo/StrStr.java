package com.hoangdieuctu.algo;

public class StrStr {

    static int strStr(String haystack, String needle) {
        if (needle == null) {
            return -1;
        }

        if (needle.isEmpty()) {
            return 0;
        }

        int i = 0;
        while (i < haystack.length()) {
            if (i + needle.length() > haystack.length()) {
                return -1;
            }

            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = 1;
                while (j < needle.length()) {
                    if (needle.charAt(j) != haystack.charAt(i + j)) {
                        break;
                    }

                    j++;
                }

                if (j == needle.length()) {
                    return i;
                }
            }

            i++;
        }

        return -1;
    }

}
