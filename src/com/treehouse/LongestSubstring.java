package com.treehouse;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        String a = "abcabcabc";
        String b = "ababababcd";
        String c = "a";
        String d = "aaaaaa";
        String e = "";

        System.out.println(anotherLongestSub(a));
        System.out.println(longestSubstring(b));
        System.out.println(longestSubstring(c));
        System.out.println(longestSubstring(d));
        System.out.println(longestSubstring(e));

    }

    public static int longestSubstring(String str) {
        HashMap<Character, Integer> seen = new HashMap<>();
        int longestSubstring = 0;
        int left = 0;

        for(int right = 0; right < str.length(); right++) {
            if(seen.containsKey(str.charAt(right))) {
                left = Math.max(left, seen.get(str.charAt(right)) + 1);
            }
            seen.put(str.charAt(right), right);
            longestSubstring = Math.max(longestSubstring, right-left + 1);
        }
        return longestSubstring;
    }



    public static int anotherLongestSub(String str) {
        Map<Character, Integer> hm = new HashMap<>();
        int longestSub = 0;
        int left = 0;

        for(int right = 0; right < str.length(); right++) {
            if(hm.containsKey(str.charAt(right))) {
                left = Math.max(left, hm.get(str.charAt(right)) + 1);
            }
            hm.put(str.charAt(right), right);
            longestSub = Math.max(longestSub, right - left + 1);
        }
        return longestSub;
    }








}
























