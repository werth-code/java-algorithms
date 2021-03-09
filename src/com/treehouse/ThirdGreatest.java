package com.treehouse;

import java.util.Arrays;
import java.util.Comparator;

public class ThirdGreatest {

    public static void main(String[] args) {
        String[] a = {"coder","byte","code"};
        System.out.println(ThirdGreatest(a));
    }

    public static String ThirdGreatest(String[] strArr) {

        // take an array of strings and return the third largest within it.
        // loop through array
        // grab word.length
        // put it into new array sorted by length
        // return third entry arr[2]

        Arrays.sort(strArr, Comparator.comparing(String::length));
        int length = strArr[strArr.length - 3].length();
        System.out.println(length);
        System.out.println(Arrays.toString(strArr));
        String finalWord = "";

        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].length() == length) finalWord = strArr[i];
        }
        return finalWord;
    }
}


//    Third Greatest
//Have the function ThirdGreatest(strArr) take the array of strings stored in strArr and return the third largest word within it. So for example: if strArr is ["hello", "world", "before", "all"] your output should be world because "before" is 6 letters long, and "hello" and "world" are both 5, but the output should be world because it appeared as the last 5 letter word in the array. If strArr was ["hello", "world", "after", "all"] the output should be after because the first three words are all 5 letters long, so return the last one. The array will have at least three strings and each string will only contain letters.
//Examples
//Input: new String[] {"coder","byte","code"}
//Output: code
//Input: new String[] {"abc","defg","z","hijk"}
//Output: abc


//Basic Roman Numerals
//Have the function BasicRomanNumerals(str) read str which will be a string of Roman numerals.
// The numerals being used are: I for 1, V for 5, X for 10, L for 50, C for 100, D for 500 and M for 1000.
// In Roman numerals, to create a number like 11 you simply add a 1 after the 10, so you get XI.
//
// But to create a number like 19, you use the subtraction notation which is to add an I before an X or V (or add an X before an L or C).
// So 19 in Roman numerals is XIX.
//
//The goal of your program is to return the decimal equivalent of the Roman numeral given. For example: if str is "XXIV" your program should return 24
//Examples
//Input: "IV"
//Output: 4
//Input: "XLVI"
//Output: 46
