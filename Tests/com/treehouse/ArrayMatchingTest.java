package com.treehouse;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ArrayMatchingTest {

    @Test
    public void arrayMatchingTest01(){
        String[] input = {"{5, 2, 3}", "{2, 2, 3, 10, 6}"};
        String expected = "7-4-6-10-6";
        String actual = ArrayMatching.arrayMatching(input);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void arrayMatchingTest02(){
        String[] input = {"[1, 2, 1]", "[2, 1, 5, 2]"};
        String expected = "3-3-6-2";
        String actual = ArrayMatching.arrayMatching(input);
        Assert.assertEquals(actual, expected);
    }

}