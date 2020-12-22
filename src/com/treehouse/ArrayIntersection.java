package com.treehouse;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
                returnArr[index] = num;
                index++;
                map.put(num, map.get(num) - 1);
            }
        }
        return Arrays.copyOf(returnArr, index);
    }


    public static int[] intersectWithStreams(int[] nums1, int[] nums2) {
        int size = 0;
        int[] returnArr = new int[nums1.length];

        List<Integer> list1 = IntStream.of(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = IntStream.of(nums2).boxed().collect(Collectors.toList());

        for (Integer num : list1) {
            if (list2.contains(num)) {
                list2.remove(num);
                returnArr[size++] = num;
            }
        }

        return Arrays.copyOf(returnArr, size);

//        return list1.stream()
//                .filter(ele-> list2.contains(ele))
//                .mapToInt(i -> i)
//                .toArray();
//    }

    }
}
