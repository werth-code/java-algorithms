package com.treehouse;

public class GridSearch {

    public static void main(String[] args) {

    }

    public static void gridSearch(String str) {
        int length = str.length();
        int offSteps = str.length() - 8; // for a 10 char str we have 2 offSteps

        int r = 0;
        int sideSteps = 0;
        int d = 0;

        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'r') r++;
            if (str.charAt(i) == 'l' || str.charAt(i) == 'u') sideSteps++;
            if (str.charAt(i) == 'd') d++;
        }

        for(int i = 0; i < str.length(); i ++) {
            if (str.charAt(i) == '?') {

            }
        }

    }
}


//"Correct Path
//        Have the function CorrectPath(str) read the str parameter being passed,
//        which will represent the movements made in a 5x5 grid of cells starting
//        from the top left position. The characters in the input string will be
//        entirely composed of: r, l, u, d, ?. Each of the characters stand for the
//        direction to take within the grid, for example: r = right, l = left, u = up, d = down.
//        Your goal is to determine what characters the question marks should be in order for
//        a path to be created to go from the top left of the grid all the way to the bottom
//        right without touching previously travelled on cells in the grid.
//
//        For example: if str is "r?d?drdd" then your program should output the final correct
//        string that will allow a path to be formed from the top left of a 5x5 grid to the
//        bottom right. For this input, your program should therefore return the string rrdrdrdd.
//        There will only ever be one correct path and there will always be at least one question
//        mark within the input string.

//        Examples
//        Input: "???rrurdr?"
//        Output: dddrrurdrd
//        Input: "drdr??rrddd?"
//        Output: drdruurrdddd
//        "

