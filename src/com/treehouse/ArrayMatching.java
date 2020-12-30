package com.treehouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMatching {

    public static String arrayMatching(String[] strArr) {
        // strArr is a multi dimensional array, containing two String elements (sub arrays)
        // we need to unfreeze the arrays, and add elements at each corresponding location (arr1[0] + arr2[0])
        // we need to return a string, of summed up pairs in like this 6-4-13-17
        // if one array is longer than another - use 0 as the number to add.
        // 1 create an Integer[] finalValues for summed pairs.
        // split both string elements into arrays using split(^0-9)
        // find out which array is longer and even make them the same length
        // replace empty spaces or null values with "0";
        // loop and add two numbers together, skip if both are 0s.

        StringBuilder sb = new StringBuilder();
        List<Integer> finalValues = new ArrayList<>();
        String[] numOne = strArr[0].split("[^0-9]");
        String[] numTwo = strArr[1].split("[^0-9]");

        if(numOne.length > numTwo.length) numTwo = Arrays.copyOf(numTwo, numOne.length);
        else numOne = Arrays.copyOf(numOne, numTwo.length);

        for(int i = 0; i < numOne.length; i++) {
            if(numOne[i] == null || numOne[i].equals("")) numOne[i] = "0";
            if(numTwo[i] == null || numTwo[i].equals("")) numTwo[i] = "0";
        }

        for(int i = 1; i < numOne.length; i++) {
            if(numOne[i].equals("0") && numTwo[i].equals("0")) continue;
            else sb.append(Integer.parseInt(numOne[i]) + Integer.parseInt(numTwo[i]) + "-");
        }
        sb.deleteCharAt(sb.length() -1);
        System.out.println(sb.toString());
        return sb.toString();
    }
}
