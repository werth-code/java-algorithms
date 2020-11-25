package com.treehouse;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void containsDuplicate() {
    //Given
        int[] arr = {1,2,3,1};
    //When
        Boolean actual = ContainsDuplicate.containsDuplicate(arr);
    //Then
        Assert.assertEquals(true, actual);
    }

    @Test
    void containsDuplicate1() {
        //Given
        int[] arr = {1,2,3,4};
        //When
        Boolean actual = ContainsDuplicate.containsDuplicate(arr);
        //Then
        Assert.assertEquals(false, actual);
    }

    @Test
    void containsDuplicate2() {
        //Given
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        //When
        Boolean actual = ContainsDuplicate.containsDuplicate(arr);
        //Then
        Assert.assertEquals(true, actual);
    }

}


//        Input: [1,2,3,1]
//        Output: true
//
//        Input: [1,2,3,4]
//        Output: false
//
//        Input: [1,1,1,3,3,4,3,2,4,2]
//        Output: true