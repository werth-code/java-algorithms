package com.treehouse;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ContainsDuplicate {

        public static boolean containsDuplicate(int[] nums) {
            if(nums.length <= 1) return false;

            HashMap<Integer, Integer> hash = new HashMap<>();
            for(int i = 0; i < nums.length; i++) {
                Integer current = nums[i];
                if(hash.containsKey(current)) return true;
                else hash.put(current, 1);
            }

            return false;

//            if(nums.length <= 1) return false;
//
//            Arrays.sort(nums);
//            for(int i = 0; i < nums.length; i ++) {
//                Integer current = nums[i];
//                Integer next = nums[(i+1) % nums.length];
//                if(current == next) return true;
//            }
//            return false;
        }

}
//    Given an array of integers, find if the array contains any duplicates.
//    Your function should return true if any value appears at least twice in the array,
//    and it should return false if every element is distinct.

//        Input: [1,2,3,1]
//        Output: true
//
//        Input: [1,2,3,4]
//        Output: false
//
//        Input: [1,1,1,3,3,4,3,2,4,2]
//        Output: true