package com.treehouse;

import java.util.ArrayList;
import java.util.List;

public class UnstackingGame { //NOT WORKING JPM 3/2021

    public static void main(String[] args) {
        System.out.println(stackingGame(7));
    }

    public static int stackingGame(int stackHeight) {
        if(stackHeight == 1) return 0;

        int sum = 0;
        List<Integer> splitVariables = new ArrayList<>();
        int split1 = 0;
        int split2 = 0;

        while(true) {
            if(stackHeight == 1) break;
            if(stackHeight % 2 == 0) {
                split1 = (stackHeight / 2);
                split2 = (stackHeight / 2);
            }
            else {
                split1 = (stackHeight / 2);
                split2 = (stackHeight / 2) + 1;
            }
            splitVariables.add(split1);
            splitVariables.add(split2);
            sum += split1 * split2;
        }
        return sum;
    }

}


