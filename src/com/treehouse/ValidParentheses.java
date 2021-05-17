package com.treehouse;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "({[]})"; // true
        String str2 = "[([)]]"; // false
        String str3 = ""; // true
        String str4 = "{{}[]()}"; // true
        String str5 = "()()()"; // true?

        System.out.println(validParentheses(str));
    }

    public static boolean validParentheses(String str) {

        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('{', '}');
        brackets.put('[', ']');

        StringBuilder sb = new StringBuilder();

        if(str.length() == 0) return true;
        if(str.length() % 2 != 0) return false;

        for(int i = 0; i < str.length(); i++) {
            if(brackets.containsKey(str.charAt(i))) sb.append(str.charAt(i));
            else {
                if(sb.length() == 0) return false;
                Character leftBracket = sb.charAt(sb.length() - 1);
                sb.deleteCharAt(sb.length() -1);
                Character correctBracket = brackets.get(leftBracket);
                if(!(str.charAt(i) == correctBracket)) return false;
            }
        }
        return sb.length() == 0;
    }
}
