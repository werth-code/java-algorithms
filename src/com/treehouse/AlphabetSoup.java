package com.treehouse;

import java.util.Arrays;
import java.util.stream.Collectors;

public  class AlphabetSoup {

    //Previous Solution

    public static String alphabetSoupImperative(String str) {
        StringBuilder returnString = new StringBuilder();
        str = str.toLowerCase();
        String[] strings = str.split("");
        Arrays.sort(strings);

        for (String letter : strings) {
            returnString.append(letter);
        }
        return returnString.toString();
    }

    /*
    Solution Using Streams
        String str = "coderbyte";
        String str2 = "ZyXwVutSrQponmlkJIHgFedCBa";
        String str3 = "GoogleIsOnlyOKAY";
    */

    public static String alphabetSoupDeclarative(String str) {
       return Arrays.stream(str.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.joining());
    }
}
