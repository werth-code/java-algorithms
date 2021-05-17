package com.treehouse;

public class TrappingRainwater {
    public static void main(String[] args) {
        int[] ints = {0,1,0,2,1,0,3,1,0,1,2}; // looking for correct answer of 8
        int[] noInts = {};
        int[] oneInt = {1};
        int[] noSpace = {1,2,1};

        System.out.println(trapWater4(ints));

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


    // int[] a = {7, 1, 3, 9}; -> 21
    // int[] b = {6, 9, 3, 4, 5, 8}; -> 32

    public static int trappedRainwater(int[] heights) {
        if(heights.length < 2) return 0;

        int greatestArea = 0;
        int p1 = 0; // take first element of arr
        int p2 = heights.length - 1; // take last element of arr

        while(p1 < p2) {
            int currentArea = 0;
            int firstWall = heights[p1];
            int secondWall = heights[p2];

            currentArea = Math.max(firstWall, secondWall) * (p2 - p1);
        }
        return greatestArea;
    }

    // take an int array [0,1,0,2,1,0,3,1,0,1,2]
    // find the greatest section of blocks that could hold water. 2, 0, 2 could hold 2 blocks of water.
    // ---> we would find this by keeping track a greater number *2* then a lesser number *0* then another greater num *2*.

    // return int - representing greatest section.


    public static int trapRainHard(int[] levels) {
        if(levels.length < 2) return 0;
        int totalWater = 0;

        for(int i = 0; i < levels.length; i++) {
            int largestLeft = 0;  // this is our largest number to the left
            int largestRight = 0; // this is our largest number to the right
            int leftP = i;        // pointer 1
            int rightP = i;       // pointer 2

            while(leftP >= 0) {         // for each iteration we will look left and right for max height and keep adding to water
                largestLeft = Math.max(largestLeft, levels[leftP]);
                leftP--;
            }

            while(rightP < levels.length) {
                largestRight = Math.max(largestRight, levels[rightP]);
                rightP++;
            }

            int currentWater = Math.min(largestLeft, largestRight) - levels[i];
            if(currentWater >= 0) {
                totalWater += currentWater;
            }
        }
        return totalWater;
    }



    public static int trapWater4(int[] height) {
        if(height.length < 2) return 0;
        int totalWater = 0;
        int maxLeft = 0;
        int maxRight = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right) {
            if(height[left] <= height[right]) {  // if the value at our left pointer is less than or = the value at right pointer
                if(height[left] >= maxLeft) {  // if our current level is greater than our left value
                    maxLeft = height[left];   // make it our left value
                }
                else {                      // or if it's less - add the difference to our totalWater
                    totalWater += maxLeft - height[left];
                }
                left++;                       // increase the pointer
            }
            else {                          // if the value at our right pointer is greater than the value at left pointer
                if(height[right] >= maxRight) {
                    maxRight = height[right];
                }
                else {
                    totalWater += maxRight - height[right];
                }
                right--;
            }
        }
        return totalWater;
    }

}
