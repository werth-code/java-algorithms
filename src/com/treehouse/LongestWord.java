package com.treehouse;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Have the longestWord(String input) take the input parameter being passed and return the
 * largest word in the string. If there are two or more words that are the same length,
 * return the first word from the string with that length. Ignore punctuation and assume
 * input will not be empty.
 */

public class LongestWord {

    public static String longestWord(String input) {
        String[] strArr = input.split("[^a-zA-Z+]");
        String returnString = "";

        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].length() > 0 && strArr[i].length() > returnString.length()) {
                returnString = strArr[i];
            }
        }
        return returnString;
    }

    public static String streamLongestWord(String input) {
        String[] inputArr = input.split("[^a-zA-Z+]");
        return Stream.of(inputArr)
                .max(Comparator.comparingInt(String::length))
                .map(String::toString)
                .orElse("");
    }

}
