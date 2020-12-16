package com.treehouse;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AlphabetSoupTest {
    String str = "coderbyte";
    String str2 = "ZyXwVutSrQponmlkJIHgFedCBa";
    String str3 = "GoogleIsOnlyOKAY";

    @Test
    public void alphabetSoupTest() {
        System.out.println(AlphabetSoup.alphabetSoupDeclarative(str));

        String actual = AlphabetSoup.alphabetSoupDeclarative(str);
        String expected = "bcdeeorty";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void alphabetSoupTest2() {
        System.out.println(AlphabetSoup.alphabetSoupDeclarative(str3));

        String actual = AlphabetSoup.alphabetSoupDeclarative(str3);
        String expected = "aeggikllnoooosyy";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void alphabetSoupTest3() {
        System.out.println(AlphabetSoup.alphabetSoupDeclarative(str2));

        String actual = AlphabetSoup.alphabetSoupDeclarative(str2);
        String expected = "abcdefghijklmnopqrstuvwxyz";

        Assert.assertEquals(expected, actual);
    }

}