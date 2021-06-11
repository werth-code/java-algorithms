package com.treehouse;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring2 {

    public static void main(String[] args) {

        String a = "abdcabb"; // 4
        String b = "aaaaaa"; // 1
        String c = ""; // 0
        String d = "abcbda"; // cbda 4
        String e = "abcbdarstuvwx"; // 11

        System.out.println(longSubstring(a));
        System.out.println(longSubstring(b));
        System.out.println(longSubstring(c));
        System.out.println(longSubstring(d));
        System.out.println(longSubstring(e));

    }

    // is the substring contiguous? No breaks between the characters? or a subsequence?
    // Does case sensitivity matter?

    private static int longSubstring(String str) {
        if(str.length() < 2) return str.length();

        int longest = 1;
        int currentLong = 1;

        Map<Character, Integer> past = new HashMap<>();

        int start = 0;
        int end = 1;

        past.put(str.charAt(0), 0);

        while (end < str.length()) {
            if(!past.containsKey(str.charAt(end))) {
                past.put(str.charAt(end), 1);
                currentLong++;
                end++;
            }
            else {
                longest = Math.max(currentLong, longest);
                currentLong = 0;
                past.clear();
                start++;
                end = start + 1;
            }
        }
        return Math.max(longest, currentLong);
    }

}
