package com.treehouse;

import java.util.ArrayList;

public class Backspace {
    public static void main(String[] args) {

        String a = "ab#z";
        String b = "az#z";
        String c = "Ab#z";

        System.out.println(backspace(a, c));

    }

    public static boolean backspace(String s, String t) {

        int p1 = s.length() - 1;
        int p2 = t.length() - 1;

        while(p1 >= 0 || p2 >= 0) { // must be || to allow for different lengths...
            if(s.charAt(p1) == '#' || t.charAt(p2) == '#') {
                if(s.charAt(p1) == '#') {
                    int backCount = 2;
                    while(backCount > 0) {
                        p1--;
                        backCount--;
                        if(s.charAt(p1) == '#') {
                            backCount += 2;
                        }
                    }
                }
                if(t.charAt(p2) == '#') {
                    int backCount = 2;
                    while(backCount > 0) {
                        p2--;
                        backCount--;
                        if(t.charAt(p2) == '#') {
                            backCount += 2;
                        }
                    }
                }
            }
            else {
                if(s.charAt(p1) != t.charAt(p2)) return false;
                else {
                    p1--;
                    p2--;
                }
            }
        }
        return true;
    }

    public static boolean backspace2(String lettersA, String lettersB) {
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
