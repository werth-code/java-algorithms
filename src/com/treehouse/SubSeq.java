package com.treehouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(Arrays.asList(8, 5, 4, 8, 4));
        System.out.println(maxTickets(ints));

    }

    static int maxTickets(List<Integer> tickets) {
        if(tickets.size() == 0) return 0;
        if(tickets.size() == 1) return 1;

        int longest = 1;
        int tempCount = 1;

        Collections.sort(tickets);

        int p1 = 0;
        int p2 = 1;

        while(p2 < tickets.size()) {
            if(tickets.get(p1).equals(tickets.get(p2)) || tickets.get(p1).equals(tickets.get(p2) -1)) {
                tempCount++;
                p2++;
                if(tempCount > longest) longest = tempCount;
                System.out.println(longest);
            }
            else {
                System.out.println(longest);
                tempCount = 1;
                p1++;
                p2 = p1 + 1;
            }
        }
        return longest;
    }

}
