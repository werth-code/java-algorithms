package com.treehouse;

import java.util.ArrayList;

public class Backspace {
    public static void main(String[] args) {

        String a = "ab#z";
        String b = "az#z";

        String c = "Ab#z";

        System.out.println(backspace(a, b));

    }

    public static boolean backspace(String lettersA, String lettersB) {
        ArrayList<Character> a = strBuilder(lettersA);
        ArrayList<Character> b = strBuilder(lettersB);
        return a.equals(b);
    }

    public static ArrayList<Character> strBuilder(String str) {
        ArrayList<Character> a = new ArrayList<>();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '#' && a.get(a.size() - 1) != null) a.remove(a.get(a.size() -1));
            else a.add(str.charAt(i));
        }
        return a;
    }
}
