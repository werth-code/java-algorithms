package com.treehouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLetters {

    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }

        // Input: "ababcbacadefegdehijhklij"
        // "ababcbaca", "defegde", "hijhklij"
        // Output: [9,7,8]

        // if we see another 'a' what do we do - count this as th

    public static List<Integer> partitionLabels(String S) {
        List<Integer> numArr = new ArrayList<>();
        Map<Character, Integer> chars = new HashMap<>();

        int end = 0;
        int begin = 0;

        for(int i = 0; i < S.length(); i++) {
            chars.put(S.charAt(i), i); //add the letter with it's last index.
        }

        for (int i= 0; i < S.length(); i++) {
            Integer index = chars.get(S.charAt(i));

            if (index > end) end = index;
            if (i == end) {
                numArr.add(end - begin + 1);
                begin = i + 1;
            }
        }
        return numArr;
    }

}
