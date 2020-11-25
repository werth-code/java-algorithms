package com.treehouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayManipulationAlgosTest {

    @Test
    void intersectTest1() {
        // Given
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        //Expected
        int[] expected = {4,9};
        //Actual
        assertArrayEquals(expected, ArrayManipulationAlgos.intersect(nums1, nums2));
    }

    @Test
    void intersectTest2() {
        // Given
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        //Expected
        int[] expected = {2,2};
        //Actual
        assertArrayEquals(expected, ArrayManipulationAlgos.intersect(nums1, nums2));
    }
}