package com.treehouse;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void testBinarySearch() {
        //GIVEN
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Amanda Augrat", "Amanda Eurlit", "Elida Sleight", "Francina Vigneault", "Lucie Hansman", "Nancie Rubalcaba"));
        list.forEach(System.out::println);
        //When
        Integer actual = BinarySearch.binarySearch(list, "Lucie Hansman");
        System.out.println(actual);
        Integer expected = 4;
        //Then
        Assert.assertEquals(expected, actual);
    }

}