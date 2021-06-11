package com.treehouse;

import java.util.Arrays;

public class BasicOperations {

    public static void main(String[] args) {
        String[] str = {"white", "space"};
        char[] chars = toCharArrFromStringArr(str);

        System.out.println(chars);

        for(char a : chars) {
            System.out.println(a);
        }

    }

    private static char[] strArrToCharArr(String[] strArr) {
        String joinedString = "";
        for(String part : strArr) {
            joinedString += part;
        }

        return joinedString.toCharArray();
    }

    private static char[] toCharArrFromStringArr(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strs.length; i++) {
            sb.append(strs[i]);
        }
        char[] newArr = new char[sb.length()];
        for(int i = 0; i < sb.length(); i++) {
            newArr[i] = sb.charAt(i);
        }
        return newArr;
    }



}
