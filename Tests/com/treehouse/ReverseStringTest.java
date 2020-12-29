package com.treehouse;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

    @Test
    public void revString() {
        String torev = "Hello how are you today";

        String actual = ReverseString.simpleReverseString(torev);
        System.out.println(actual);
        String expected = "yadot uoy era woh olleH";

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void revStringWithPunc() {
        String torev = "Hello!! how? 22are you today1!";

        String actual = ReverseString.reverseStringWithPunctuation(torev);
        System.out.println(actual);
        String expected = "yadot uoy era woh olleh";

        Assert.assertEquals(expected, actual);
    }

}