package com.treehouse;
import java.util.Arrays;

class FindOdd {

    // 111 222 33 4444
    // new int[]{1,1,1,1,1,1,10,1,1,1,1};

    public static int findIt(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count = count ^ a[i];
        }
        return count;
    }
}
//        int i;
//        int count = 0;
//        Arrays.sort(a);
//
//        for(i = 0; i < a.length; i++) {
//            for(int j = 0; j < a.length; j++) {
//                if(a[i] == a[j]) {
//                    count++;
//                }
//            }
//            if (count % 2 != 0) return a[i];
//            else count = 0;
//        }
//        return -1;
//    }


// find number that appears odd number
