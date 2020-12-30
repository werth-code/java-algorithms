package com.treehouse;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

class CountingMinutesTest {

    @Test
    public void countingMinutesTest01() throws ParseException {
        String input = "12:30pm-12:00am";
        String expected = "690";
        String actual = CountingMinutes.countingMinutes(input);
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void countingMinutesTest02() throws ParseException {
        String input = "1:23am-1:08am";
        String expected = "1425";
        String actual = CountingMinutes.countingMinutes(input);
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
}