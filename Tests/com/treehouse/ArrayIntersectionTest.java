package com.treehouse;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIntersectionTest {

    @Test
    void intersect() {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        System.out.println(Arrays.toString(ArrayIntersection.intersect(nums1, nums2)));
    }

    @Test
    void intersect2() {
        int[] nums1 = {4,9,5,2,2}, nums2 = {9,4,9,8,4,2,2};
        System.out.println(Arrays.toString(ArrayIntersection.intersect(nums1, nums2)));
    }

}