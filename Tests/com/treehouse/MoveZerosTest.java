package com.treehouse;

import org.junit.Test;

import static com.treehouse.MoveZeros.moveZeroes;
import static org.junit.jupiter.api.Assertions.*;

class MoveZerosTest {

    @Test
    public void findTest() {
        int[] input = {0,1,0,3,12};
        int[] output = {1,3,12,0,0};

        assertEquals(input, output);

    }
}