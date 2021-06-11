package com.treehouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallestSubstring {

    public static void main(String[] args) {


    }

    public static String smallestSubstringUniqueChars(char[] arr, String str) {
        String output = "";
        int checkCount = 0;
        List<String> strArr = new ArrayList<>(Arrays.asList(str.split("")));

        for(int i = 0; i < arr.length; i++) {
            char current = arr[i];
            if(strArr.contains(current)) { //This is the part that wont work. Its having trouble with string...
                output += current;
                checkCount ++;
                if(checkCount == arr.length) return output;
            }
            else {
                checkCount = 0;
                output = "";
            }
        }
        return "";
    }
}

//arr = [x, y, z], String = "xyyzyzyx"
//find the smallest substring of sty containing all the characters in arr.
//Return "" if such a s substring doesnt exist.

//div string by 2
//div string by 3.. etc until it finds the substring containing the chars.

