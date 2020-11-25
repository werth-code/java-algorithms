package com.treehouse;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosTest {

    @org.junit.jupiter.api.Test
    void moveZeroes() throws Exception {
        //Given
        int[] input = {0,0,1,0,3,12};
        //Expects
        int[] output = {1,3,12,0,0,0};
        //Actual
        assertArrayEquals(output, MoveZeros.moveZeroes(input));
    }
}