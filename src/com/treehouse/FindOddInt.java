package com.treehouse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class FindOdd {

    public static Integer findIt(int[] a) {
        int count = 1;
        Arrays.sort(a);
        List<Integer> intList = Arrays.stream(a).boxed().collect(Collectors.toList());
        System.out.println(intList);
        for (int i = 0; i < intList.size(); i++) {
            int current = intList.get(i);
//            int next = intList.get( (i+1) % intList.size() ); // This loops around to the beginning when at last index.
//            if(current != next && count == 1 || intList.size() == 1) return current;
//
//            if(current == next) {
//                count++;
//                if (count % 2 != 0 && current != intList.get(next + 1)) {
//                    System.out.println(current);
//                    return current;
//                }
//            }
//            else count = 1;

            if(intList.indexOf(current) == intList.lastIndexOf(current)) return current;
            List<Integer> sub = intList.subList(intList.indexOf(current), intList.lastIndexOf(current) + 1);
            System.out.println(sub);
            if(sub.size() % 2 != 0) return current;
            else i = intList.lastIndexOf(current);
        }
        System.out.println("Failed To Return");
        return -000;
    }

    //List<E> subList(int fromIndex, int toIndex)	It is used to fetch all the elements lies within the given range.

//    public static int findIt(int[] a) {
//        int count = 0;
//        for (int i = 0; i < a.length; i++) {
//            count = count ^ a[i];
//        }
//        return count;
//    }
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
