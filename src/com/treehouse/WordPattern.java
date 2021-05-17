package com.treehouse;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;

        Map<String, Character> wordMap = new HashMap<>();
        Map<Character, String> charMap = new HashMap<>();

        for(int i = 0; i < words.length; i++) {
            Character currChar = pattern.charAt(i);
            String currWord = words[i];

            if(wordMap.containsKey(currWord) && !wordMap.get(currWord).equals(currChar)) return false;
            else wordMap.put(currWord, currChar);

            if(charMap.containsKey(currChar) && !charMap.get(currChar).equals(currWord)) return false;
            else charMap.put(currChar, currWord);
        }

        return true;
    }
}
