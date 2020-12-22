package com.treehouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodDistributionTest {

    @Test
    void foodDistribution() {
        int[] arr = {5, 3, 1, 2, 1};
        System.out.println(FoodDistribution.foodDistribution(arr));
    }
}