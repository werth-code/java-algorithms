package com.treehouse;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextPalindromeTest {

    @Test
    void nextPalindrome1() {
        Integer actual = NextPalindrome.nextPalindrome(2);
        Integer expected = 3;
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    void nextPalindrome2() {
        Integer actual = NextPalindrome.nextPalindrome(180);
        Integer expected = 181;
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    void nextPalindrome3() {
        Integer actual = NextPalindrome.nextPalindrome(200);
        Integer expected = 202;
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }
}