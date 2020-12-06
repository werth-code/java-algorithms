package com.treehouse;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestSubstringTest {

    @Test
    void smallestSubstringUniqueChars() {
        String actual = SmallestSubstring.smallestSubstringUniqueChars(new char[]{'x', 'y', 'z'}, "xyyzyzyx");
        String expected = "zyx";
        Assert.assertEquals(expected, actual);
    }
}