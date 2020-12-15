package com.treehouse;

import java.util.Arrays;

public  class AlphabetSoup {

    public static String alphabetSoup(String str) {
        StringBuilder returnString = new StringBuilder();

        str = str.toLowerCase();
        String[] strings = str.split("");
        Arrays.sort(strings);

        for (String letter : strings) {
            returnString.append(letter);
        }

        return returnString.toString();
    }
}
