package com.treehouse;

public class ProductExceptSelf {

    // create final array to return
    // create an array to hold all values at nums[i] to the right
    // we need to set last element of right to 1
    // loop through and add all product of elements to right
    // create an array to hold all values at nums[i] to the left
    // we need to set first element of left to 1
    // loop through and add all product of elements to right
    // loop again and add left[i] & right[i] together - add to product[i]


    public static int[] productExceptSelf(int[] nums) {

        int[] product = new int[nums.length];
        int[] right = new int[nums.length];
        int[] left = new int[nums.length];

        left[0] = 1;
        right[nums.length - 1] = 1;

        for(int i = 1; i < nums.length; i++) {   // start at value one less than current so we can grab the 0th ele
            left[i] = left[i - 1] * nums[i - 1];
        }

        for(int i = nums.length - 2; i >= 0; i--) {   // values greater than our current
            right[i] = right[i + 1] * nums[i + 1];    // we are getting last element in the loop so it should work.
        }

        for(int i = 0; i < nums.length; i++) {
            product[i] = left[i] * right[i];
        }

        return product;
    }

}
