package com.treehouse;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public class FoodDistribution {

// Using the Java language, have the function FoodDistribution(arr) read the array of numbers stored in arr
// which will represent the hunger level of different people ranging from 0 to 5 (0 meaning not hungry at all, 5 meaning very hungry).
// You will also have N sandwiches to give out which will range from 1 to 20. The format of the array will be [N, h1, h2, h3, ...]
// where N represents the number of sandwiches you have and the rest of the array will represent the hunger levels of different people.
// Your goal is to minimize the hunger difference between each pair of people in the array using the sandwiches you have available.

    public static int foodDistribution(int[] arr) {

        int numSammy = arr[0];
        int[] newArr = Arrays.copyOfRange(arr, 1, arr.length);
        int[] addArr = new int[arr.length - 1];

        for (int i = 0; i < newArr.length - 1; i++) {
            int diff = 0;
            int current = newArr[i];
            int next = newArr[i + 1];

            if (current > next) {
                diff = current - next;
                if (numSammy >= diff) {
                    addArr[i] = current - diff;
                    numSammy -= diff;
                } else {
                    addArr[i] = current - numSammy;
                    numSammy = 0;
                }
                addArr[i + 1] = next;
            } else if (next > current) {
                diff = next - current;
                if (numSammy >= diff) {
                    addArr[i + 1] = next - diff;
                    numSammy -= diff;
                } else {
                    addArr[i + 1] = next - numSammy;
                    numSammy = 0;
                }
                addArr[i] = current;
            } else addArr[i] = current;

            if (numSammy == 0) break;
        }
        Arrays.sort(addArr);
        return addArr[addArr.length - 1] - addArr[0];
    }

    //int[] arr = {5,      2, 3, 4, 5};

    public static int foodDistribution2(int[] arr) {
        int numSammy = arr[0];
        int[] newArr = Arrays.copyOfRange(arr, 1, arr.length);

        Arrays.sort(newArr);

        while (numSammy > 0) {
            Arrays.sort(newArr);
            System.out.println("Array Iteration: " + Arrays.toString(newArr));
            int last = newArr[newArr.length -1];

            if(last == newArr[0] || last == 0) break;
            else {
                newArr[newArr.length -1]--;
                numSammy--;
            }
        }

        Arrays.sort(newArr);
        System.out.println("Final Array: " + Arrays.toString(newArr));
        return newArr[newArr.length -1] - newArr[0];
    }

}
//                diff = Math.abs(current - next);
//                numSammy -= diff;
//                addArr[count] = (next - diff);
//                addArr[count + 1] = next;
//                count++;
//                System.out.println("NumSammy: " + numSammy);

//                diff = Math.abs(next - current);
//                numSammy -= diff;
//                addArr[count] = (current - diff);
//                addArr[count + 1] = next;
//                count++;
//                System.out.println("NumSammy: " + numSammy);