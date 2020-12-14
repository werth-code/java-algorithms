package com.treehouse;

import java.util.*;

public class BinarySearch {

//    Linear Search is O(n)

//    for(thing : things) {
//        if(thing == thingWeAreLookingFor) {
//            return thing;
//        }
//        return -1;
//    }

//    Binary Search is O(log n)
//    Must be sorted

    public static Integer binarySearch(List<String> list, String target) {
        Integer startIndex = 0;
        Integer lastIndex = list.size() - 1;

        while (startIndex <= lastIndex) {
            Integer midIndex = (startIndex + lastIndex) / 2;
            if (list.indexOf(target) == midIndex) return midIndex;
            else if (list.indexOf(target) > midIndex) startIndex = midIndex + 1;
            else lastIndex = midIndex - 1;
        }
        return -1;
    }


}
