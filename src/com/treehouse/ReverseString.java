package com.treehouse;

import java.util.Arrays;

public class ReverseString {

    public static String simpleReverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    //return all lower-cased and without any punctuation.
    public static String reverseStringWithPunctuation(String input) {
        StringBuilder sb = new StringBuilder();

        String lcInput = input.toLowerCase();
        String[] words = lcInput.split("[^a-zA-Z+]");

        for(int i = 0; i < words.length; i ++) {
            if(words[i].length() > 0) {
                sb.append(words[i]);
                sb.append(" ");
            }
        }
        return sb.reverse().toString().trim();
    }
}
