package com.treehouse;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TwoSumTest {

    @Test
    void twoSumTest1(){

        int[] nums = new int[] {2,7,11,15};
        int target = 9;

        int[] exp =  {0,1};
        String expected = Arrays.toString(exp);
        String actual = Arrays.toString(TwoSum.twoSum(nums, target));
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    void twoSumTest2(){

        int[] nums = new int[] {3, 2, 4};
        int target = 6;

        int[] exp =  {1,2};
        String expected = Arrays.toString(exp);
        String actual = Arrays.toString(TwoSum.twoSum(nums, target));
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

}


