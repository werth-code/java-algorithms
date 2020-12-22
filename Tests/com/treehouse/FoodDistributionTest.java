package com.treehouse;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodDistributionTest {

    @Test
    void foodDistribution() {
        int[] arr = {5, 3, 1, 2, 1};

        int actual = FoodDistribution.foodDistribution2(arr);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    void foodDistribution2() {

        int[] arr = {4, 5, 2, 3, 1, 0};

        int actual = FoodDistribution.foodDistribution2(arr);
        int expected = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    void foodDistribution3() {

        int[] arr = {3, 2, 1, 0, 4, 1, 0};

        int actual = FoodDistribution.foodDistribution2(arr);
        int expected = 4;

        Assert.assertEquals(expected, actual);
    }

    @Test
    void foodDistribution4() {

        int[] arr = {5, 2, 3, 4, 5};

        int actual = FoodDistribution.foodDistribution2(arr);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }



}