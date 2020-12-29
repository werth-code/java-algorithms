package com.treehouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
;

public class TwoSum {

//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Output: Because nums[0] + nums[1] == 9, we return [0, 1].

//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//    You can return the answer in any order.

    public static int[] twoSum(int[] nums, int target) {
        int[] sums = new int[2];
        List<Integer> pastInts = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int needed = target - current;

            if (pastInts.contains(needed)) {
                sums[0] = pastInts.indexOf(needed);
                sums[1] = i;
                return sums;
            }

            pastInts.add(current);
        }
        return null;
    }


    public static int[] twoSum2 (int[] nums, int target) {
        int[] sums = new int[2];

        IntStream.of(nums).sum();

        return null;
    }


}

// TODO: 12/18/20 This can be solved with the same logic using a HashMap - try to do this using  streams.