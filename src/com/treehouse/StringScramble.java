package com.treehouse;

import java.util.*;
import java.io.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StringScramble {
    private static Process logger;

    public static String StringScramble(String str1, String str2) {

        String oneReplaced = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String twoReplaced = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        List<String> one = Arrays.asList(oneReplaced.split(""));
        List<String> two = Arrays.asList(twoReplaced.split(""));

        for(int i = 0; i < two.size(); i++) {
            if(!one.contains(two.get(i))) return "false";
        }
        return "true";
    }

    public static String StringScramble2(String str1, String str2) {

        String oneReplaced = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String twoReplaced = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        String[] one = oneReplaced.split("");
        String[] two = twoReplaced.split("");

        Map<String, Integer> map = Stream.of(two)
                .collect(Collectors.toMap(
                        str->str,
                        num->1,
                        Integer::sum
                ));

        for(String val : one) {
            if(map.get(val) == null) return "false";
            else {
                Integer value = map.get(val);
                value -= 1;
                if(value < 0) return "false";
            }
        }
        return "true";
    }


        public static String stringScramble3(String str1, String str2) {

            String match = "false";
            String stringMatched = "" + match;

            int counter = 0;
            char[] str1Arr = str1.toCharArray();

            for(char character: str1Arr){
                String temp = "" + character;
                if(str2.contains(temp)){
                    counter++;
                }
            }
            if(str2.length() == counter){
                match = "true";
            }
            return match;
        }

    public static void main (String[] args) {

        System.out.println(StringScramble.StringScramble2("h3llko", "hello"));
        System.out.println(StringScramble.stringScramble3("h3llko", "hello"));

    }

}