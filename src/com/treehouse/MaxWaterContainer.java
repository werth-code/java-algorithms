package com.treehouse;

import java.util.HashMap;
import java.util.Map;

public class MaxWaterContainer {

    public static void main(String[] args) {

    }

    public static int maxWaterContainer(int [] ints) {
        int maxWater = 0;
        for(int p1 = 0; p1 < ints.length; p1++) {
            for(int p2 = p1 + 1; p2 < ints.length; p2++) {
                int height = Math.min(ints[p1], ints[p2]);
                int width = p2 - p1;
                int area = height * width;
                maxWater = Math.max(maxWater, area);
            }
        }
        return maxWater;
    }


    public static int maxWaterContainer2(int [] ints) {
        int maxArea = 0; // holds our greatest amount
        int p1 = 0; // this is our starting pointer
        int p2 = ints.length -1; // this is our end pointer

        while(p1 < p2) { // as long as p1 < p2.. when they are = break the loop
            int height = Math.min(ints[p1], ints[p2]); // our height will be the greater of the two numbers at each pointer
            int width = p2 - p1; // our width will be the distance between the two pointers
            int area = height * width; // our total area will be our h * w
            maxArea = Math.max(maxArea, area); // if this area is greater than our current maxArea - replace - otherwise keep current maxArea

            if(ints[p1] <= ints[p2]) p1++; // if our first pointers value is <= second pointer value increase the p1 count and repeat the process
            else p2--; // otherwise decrease the position of our second pointer.
        }
        return maxArea;
    }

}
