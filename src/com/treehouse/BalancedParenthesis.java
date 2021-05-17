package com.treehouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {

        String str1 = "a)bc(d)"; // -> "abc(d)"
        String str2 = "(ab(c)d"; // -> "ab(c)d" OR "(abc)d"
        String str3 = "))(("; // -> ""

        System.out.println(balancedParenthesis(str1));

    }
    // We may want each index stored with this.. Could we use an ArrayList and put at the correct index...  ArrayList[2] = "(", ArrayList[3] = ")" ----- O(n)


    // take in a String
    // We need some sort of way to keep count or track of the brackets ->
    // StringBuilder sb = new StringBuilder(); or arrayList
       // left count
       // right count
    // loop,
    // if str.charAt(i) == '(' || ')' add to left or right
    // also append to sb ---->  ")(()(())(()"
    //
    // return the balanced String

    public static String balancedParenthesis(String str) {
        String[] string = str.split("");
        List<Character> indexes = new ArrayList<>();
        List<Integer> brackets = new ArrayList<>();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                brackets.add(i);
                indexes.add(str.charAt(i));
            }
            else if(str.charAt(i) == ')') {
                if(brackets.size() > 0) {
                    brackets.remove(brackets.get(brackets.size() - 1));
                    indexes.add(str.charAt(i));
                }
            }
            else indexes.add(str.charAt(i));
        }

        if(brackets.size() > 0) {
            for(int i = 0; i < brackets.size(); i++) {
                string[brackets.get(i)] = " ";
            }
            return String.join(", ", (CharSequence) brackets);
        }
        return indexes.toString();
    }




    public String minRemoveToMakeValid(String s) {

        StringBuilder result = new StringBuilder();
        int left = 0;
        int right = 0;

        for(int i = 0; i < s.length(); i++) {
            char present = s.charAt(i);
            if(present == '(') {
                result.append(present);
                left++;
            }
            else if(present == ')' && left > 0) {
                left--;
                result.append(present);
            }
            else if(Character.isAlphabetic(present)) result.append(present);
        }
        if(left > 0) {
            while(left > 0) {
                int position = result.lastIndexOf("(");
                result.deleteCharAt(position);
                left--;
            }
        }
        return result.toString();
    }



    public String minRemoveToMakeValid2(String s) {
        char sChars[] = s.toCharArray();
        int len = sChars.length;

        Stack<Character> stack = new Stack<>();
        Stack<Integer> indexesToRemove = new Stack<>();

        for(int i=0; i<len; i++){
            char c = sChars[i];

            if (c == ')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
                indexesToRemove.pop();
            } else if(c == '(' || c == ')'){
                stack.push(c);
                indexesToRemove.push(i);
            }
        }

        StringBuilder sb = new StringBuilder(s);

        while(!indexesToRemove.isEmpty()){
            sb.deleteCharAt(indexesToRemove.pop());
        }
        return sb.toString();

    }

}

// stringBuilder wont work here... need different ds...



















