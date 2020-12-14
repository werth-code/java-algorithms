package com.treehouse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    //quicksort is marginally faster than mergesort but they are both highly efficient. (0 log n)

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(32, 100, 1, 2, 29, 28, 88, 3, 50, 67, 37, 1, 57, 20));
        System.out.println(quicksort(list));

        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(32, 100, 1, 2, 29, 28, 88, 3, 50, 67, 37, 1, 57, 20));
        System.out.println(mergeSort(list2));

        ArrayList<String> list3 = new ArrayList<String>(
                Arrays.asList("Elida Sleight", "Francina Vigneault", "Lucie Hansman", "Nancie Rubalcaba"));
        System.out.println(indexOfItem(list3, "Lucie Hansman"));
    }

    static ArrayList<Integer> quicksort(ArrayList<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        ArrayList<Integer> lessThanPivot = new ArrayList<Integer>();
        ArrayList<Integer> greaterThanPivot = new ArrayList<Integer>();

        int pivot = list.get(0);
        int length = list.size();
        for (int i = 1; i < length; i++) {
            int currentValue = list.get(i);
            if (currentValue <= pivot) {
                lessThanPivot.add(currentValue);
            } else {
                greaterThanPivot.add(currentValue);
            }
        }
        ArrayList<Integer> sortedList = new ArrayList<Integer>();
        sortedList.addAll(quicksort(lessThanPivot));
        sortedList.add(pivot);
        sortedList.addAll(quicksort(greaterThanPivot));
        return sortedList;
    }


        static List<Integer> mergeSort(List<Integer> list) {
            if (list.size() <= 1) {
                return list;
            }
            int middleIndex = list.size() / 2;
            List<Integer> leftList =
                    mergeSort(list.subList(0, middleIndex));
            List<Integer> rightList =
                    mergeSort(list.subList(middleIndex, list.size()));
            List<Integer> sortedList = new ArrayList<Integer>();
            int leftIndex = 0;
            int rightIndex = 0;
            int leftLength = leftList.size();
            int rightLength = rightList.size();
            while (leftIndex < leftLength && rightIndex < rightLength) {
                if (leftList.get(leftIndex) < rightList.get(rightIndex)) {
                    sortedList.add(leftList.get(leftIndex));
                    leftIndex++;
                } else {
                    sortedList.add(rightList.get(rightIndex));
                    rightIndex++;
                }
            }
            sortedList.addAll(leftList.subList(leftIndex, leftLength));
            sortedList.addAll(rightList.subList(rightIndex, rightLength));
            return sortedList;
        }


        static int indexOfItem(List<String> list, String target) {
            int first = 0;
            int last = list.size() - 1;
            while (first <= last) {
                int midpoint = (first + last) / 2;
                int comparisonResult = list.get(midpoint).compareTo(target);
                if (comparisonResult == 0) {
                    return midpoint;
                } else if (comparisonResult < 0) {
                    first = midpoint + 1;
                } else {
                    last = midpoint - 1;
                }
            }
            // We have to return an integer, so return an "impossible"
            // index to indicate value was not found.
            return -1;
        }





    //System.out.println(IntStream.range(1,5).sum()); //prints 10 (sum of all numbers up to and not including 5.)

//        Stream.of("Ava", "Aneri", "Alberto")
//                .sorted()
//                .findFirst()
//                .ifPresent(System.out::println); //prints "Alberto"

//        String[] names = {"Al", "Ankit", "Ami", "Brent", "Aaron", "Amanda", "Barb"}; //THIS IS AMAZING!!!!! YESSSS!!!!
//        Stream.of(names)
//                .filter(ele -> ele.startsWith("Am")) //Will return " Amanda Ami
//                .sorted()
//                .forEach(System.out::println);

    //Average of squares in an int array

//        Arrays.stream(new int[] {2, 4, 6, 8, 10})
//                .map(num -> num * num)
//                .average()
//                .ifPresent(System.out::println);

//        List <String> names = Arrays.asList("Ankit", "Ami", "Brent", "Aaron", "amandA", "Barb", "andy");
//        names
//                .forEach(name -> {
//                    name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
//                    System.out.println(name); //Proper Case All Names In List
//                });

//        Stream <String> names = Files.lines(Paths.get("/Users/m21/dev/names.txt"));
//        names
//            .forEach(name -> {
//                        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
//                        System.out.println(name);
//                    });
//        names.close();
//    }
}
