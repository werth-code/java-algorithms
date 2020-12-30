package com.treehouse;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TimeConvertTest {

    @Test
    public void timeConvertTest01(){
        int input = 126;
        String expected = "2:6";
        String actual = TimeConvert.timeConvert(input);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void timeConvertTest02(){
        int input = 45;
        String expected = "0:45";
        String actual = TimeConvert.timeConvert(input);
        Assert.assertEquals(actual, expected);
    }

}