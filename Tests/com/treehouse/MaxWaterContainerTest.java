package com.treehouse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxWaterContainerTest {

    @Test
    public void maxWaterContainer() {
        //given
        int[] ints = {7, 1, 2, 3, 9};
        //when
        int expected = 28;
        int actual = MaxWaterContainer.maxWaterContainer2(ints);
        //then
        System.out.println(expected);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maxWaterContainer2() {
        //given
        int[] ints = {4, 8, 1, 2, 3, 9};
        //when
        int expected = 32;
        int actual = MaxWaterContainer.maxWaterContainer2(ints);
        //then
        System.out.println(expected);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maxWaterContainer3() {
        //given
        int[] ints = {4, 8, 1, 2, 3, 9, 2, 1, 2};
        //when
        int expected = 32;
        int actual = MaxWaterContainer.maxWaterContainer2(ints);
        //then
        System.out.println(expected);
        Assert.assertEquals(expected, actual);
    }
}