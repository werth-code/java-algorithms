package com.treehouse;

import java.util.Arrays;

public class FoodDistribution {

    public static int foodDistribution(int[] arr) {
        int numSammy = arr[0];

        for(int i = 1; i < arr.length -1; i++) {
            int current = arr[i];
            int next = arr[i+1];

            System.out.println(current);
            System.out.println(next);

            if(numSammy > 0 && current > next ) {
                next += Math.abs(current - next);
            }
            else if(numSammy > 0 && next > current) {
                current += Math.abs(next - current);
            }
            else continue;
        }
        int[] newArr = Arrays.copyOfRange(arr, 1, arr.length);
        System.out.println(Arrays.toString(newArr));

        int[] finalArr = Arrays.stream(newArr).sorted().toArray();
        System.out.println(Arrays.toString(finalArr));

        return finalArr[finalArr.length -1] - finalArr[0];
    }

}
