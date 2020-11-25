package com.treehouse;

import java.util.Arrays;

public class MoveZeros {

    public static int[] moveZeroes(int[] nums) {
        int countOfNonZeros = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentNumberInArray = nums[i];
            System.out.println("Count: " + countOfNonZeros + " Current: " + currentNumberInArray + " Array " +  Arrays.toString(nums));
            if (currentNumberInArray != 0) {
                nums[countOfNonZeros] = currentNumberInArray;
                countOfNonZeros++;
            }
        }

        for(int j = countOfNonZeros; j < nums.length; j++) {
            nums[j] = 0;
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}

//    int[] input = {0,1,0,3,12};
//    int[] output = {1,3,12,0,0};


// count the zeros and add them to the end. rearrange the other numbers.