package com.treehouse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class hailSeq {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;

        while ((line = in.readLine()) != null) {
            int numIn = Integer.parseInt(line);
            List<Integer> list = new ArrayList<>();
            List<Integer> returnList = hailSequence(numIn, list);

            String finalString = "";

            for(int num : returnList) {
                finalString += num + " ";
            }

            System.out.println(finalString);
        }
    }

    public static List<Integer> hailSequence(int numIn, List<Integer> list) {
        if(numIn <= 1) return list;
        else if(numIn % 2 == 0) { //num is even
            int seq = numIn / 2;
            list.add(seq);
            return hailSequence(seq, list);
        }
        else { //num is odd
            int seq = (numIn * 3) + 1;
            list.add(seq);
            return hailSequence(seq, list);
        }
    }
}
