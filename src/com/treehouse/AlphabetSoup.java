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
    //!! Collectors.joining takes an optional delimiter so you can join on " " or "-" etc !!

    /*
    Solution Using Streams
        String str = "coderbyte";
        String str2 = "ZyXwVutSrQponmlkJIHgFedCBa";
        String str3 = "GoogleIsOKAY";
    */

    public static String alphabetSoupDeclarative(String str) {
       return Arrays.stream(str.toLowerCase().split(""))
                    .sorted()
                    .collect(Collectors.joining());
    }
}
