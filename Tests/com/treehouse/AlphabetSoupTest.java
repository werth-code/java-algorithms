package com.treehouse;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AlphabetSoupTest {
    String str = "coderbyte";
    String str3 = "GoogleIsOnlyOKAY";

    @Test
    public void alphabetSoupTest() {
        System.out.println(AlphabetSoup.alphabetSoup(str));

        String actual = AlphabetSoup.alphabetSoup(str);
        String expected = "bcdeeorty";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void alphabetSoupTest2() {
        System.out.println(AlphabetSoup.alphabetSoup(str3));

        String actual = AlphabetSoup.alphabetSoup(str3);
        String expected = "aeggikllnoooosyy";

        Assert.assertEquals(expected, actual);
    }

}