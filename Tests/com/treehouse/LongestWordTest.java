package com.treehouse;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class LongestWordTest {

    @Test
    public void longestWordTest() {
        String words = "I am! making up words2222 so that I can : m010wwww222223332s test!@@";

        String actual = LongestWord.longestWord(words);
        System.out.println(actual);
        String expected = "making";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void streamLongestWordTest() {
        String words = "I am! making baking up words2222 so that I can : m010wwww222223332s test!@@";

        String actual = LongestWord.streamLongestWord(words);
        System.out.println(actual);
        String expected = "making";

        Assert.assertEquals(expected, actual);
    }

}