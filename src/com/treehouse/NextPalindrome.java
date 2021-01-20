package com.treehouse;

public class NextPalindrome {
    public static void main(String[] args) {
        System.out.println(nextPalindrome(10));
    }

    public static Integer nextPalindrome(Integer num) {
        if(num < 10) return num + 1;

        int i = num + 1;
        while(true) {
            StringBuilder sb = new StringBuilder();

            String secondNum = sb.append(i).toString();
            String reversedNum = sb.reverse().toString();

            if(secondNum.equals(reversedNum)) return Integer.parseInt(secondNum);
            i++;
        }
    }
}


//"Next Palindrome
//        Have the function NextPalindrome(num) take the num parameter being passed
//        and return the next largest palindromic number. The input can be any positive integer.
//        For example: if num is 24, then your program should return 33 because that is the next
//        largest number that is a palindrome.

//        Examples
//        Input: 2
//        Output: 3
//        Input: 180
//        Output: 181
