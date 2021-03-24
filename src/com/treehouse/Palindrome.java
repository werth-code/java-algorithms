package com.treehouse;

public class Palindrome {
    public static void main(String[] args) {
        String a = "abccdba";
        System.out.println(palindrome(a));

    }

    public static boolean palindrome(String str) {
        if(str.length() <= 1) return true;

        int offBy = 0;
        int left = 0;
        int right = str.length() -1;

        while(left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            }
            else {
                if(str.charAt(left + 1) == str.charAt(right)) left++;
                else if(str.charAt(right - 1) == str.charAt(left)) right--;
                else return false;
                offBy++;
            }
            if(offBy > 1) return false;
        }
        return true;
    }
}
