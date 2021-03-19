package com.treehouse;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrappingRainwaterTest {
    int[] ints = {0,1,0,2,1,0,3,1,0,1,2}; // looking for correct answer of 8
    int[] noInts = {}; // 0
    int[] oneInt = {1}; // 0
    int[] noSpace = {1,2,1}; // 0

    @Test
    public void trappingRainWater() {
        //given

        //when
        int actual = TrappingRainwater.trappingRainWater(ints);
        int expected = 8;
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void trappingRainWater2() {
        //given

        //when
        int actual = TrappingRainwater.trappingRainWater(noInts);
        int expected = 0;
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void trappingRainWater3() {
        //given

        //when
        int actual = TrappingRainwater.trappingRainWater(oneInt);
        int expected = 0;
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void trappingRainWater4() {
        //given

        //when
        int actual = TrappingRainwater.trappingRainWater(noSpace);
        int expected = 0;
        //then
        Assert.assertEquals(expected, actual);
    }
}