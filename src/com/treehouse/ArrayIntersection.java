package com.treehouse;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayIntersection {

    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] returnArr = new int[nums1.length];

        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;

        for (int num : nums1) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else map.put(num, 1);
        }

        for (int num : nums2) {
            if(map.containsKey(num) && map.get(num) > 0) {
                returnArr[index++] = num;
                map.put(num, map.get(num) - 1);
            }
        }
        return Arrays.copyOf(returnArr, index);
    }
}
