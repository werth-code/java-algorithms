package com.treehouse;

import java.util.Arrays;

public  class AlphabetSoup {

    public static String alphabetSoup(String str) {
        String returnString = "";

        String[] strings2 = str.split("");
        Arrays.sort(strings2);

        for (String letter : strings2) {
            returnString += letter.toLowerCase();
        }
        return returnString;
    }
}
