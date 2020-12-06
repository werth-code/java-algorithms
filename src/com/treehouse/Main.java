package com.treehouse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        String str = "this is a string";
        String[] split = str.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        Arrays.stream(split).forEachOrdered(ele -> {
            ele = Character.toUpperCase(ele.charAt(0)) + ele.substring(1);
            stringBuilder.append(ele + " ");
        });
        System.out.println(stringBuilder);
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
