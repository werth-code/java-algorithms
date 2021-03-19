package com.treehouse;

public class TrappingRainwater {
    public static void main(String[] args) {
        int[] ints = {0,1,0,2,1,0,3,1,0,1,2}; // looking for correct answer of 8
        int[] noInts = {};
        int[] oneInt = {1};
        int[] noSpace = {1,2,1};

        System.out.println(trappingRainWater(ints));

    }




    public static int trappingRainWater(int[] height) {
        int totalWater = 0;
        int left = 0;
        int right = height.length -1;
        int maxLeft = 0;
        int maxRight = 0;

        while(left < right) {
            if(height[left] <= height[right]) {
                if(height[left] >= maxLeft) maxLeft = height[left]; // this needs to be >= because it will hold water if level..
                else totalWater += maxLeft - height[left];
                System.out.println(maxLeft + " " + totalWater);
                left++;
            }
            else {
                if(height[right] >= maxRight) maxRight = height[right];
                else totalWater += maxRight - height[right];
                System.out.println(maxRight + " " + totalWater);
                right--;
            }
        }
        return totalWater;
    }




    public static int trappingRainWaterBRUTE(int[] height) {
        int totalWater = 0;
        for(int p = 0; p < height.length; p++) {
            int left = p;
            int right = p;
            int maxL = 0;
            int maxR = 0;

            while(left >= 0) {
                maxL = Math.max(maxL, height[left]);
                left--;
            }
            while(right < height.length) {
                maxR = Math.max(maxR, height[right]);
                right++;
            }

            int currentWater = Math.min(maxL, maxR) - height[p];
            if(currentWater >= 0) totalWater += currentWater;
        }
        return totalWater;
    }
}
