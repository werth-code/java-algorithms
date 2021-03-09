package com.treehouse;

import java.util.*;

public class ATemplateForAlgorithm {

    public static void main(String[] args) {
        System.out.println(AlphabetSearching("abcdefghijklm1nopqrstuvwxyzz"));
    }

    public static String AlphabetSearching(String str) {
        str = str.toLowerCase();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String finalString = "";

        for (int i = 0; i < str.length(); i++) {
            if(alpha.indexOf(str.charAt(i)) != -1 && finalString.indexOf(str.charAt(i)) == -1) finalString += str.charAt(i);
        }

        if(alpha.length() != finalString.length()) return "false";
        return "true";
    }


}