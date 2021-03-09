package com.treehouse;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DashInsertTest {

    @Test
    void test1() {
        String str = "22233222";
        String actual = DashInsert.DashInsert2(str);
        System.out.println(actual);

        String expected = "2223-3222";

        Assert.assertEquals(expected, actual);

    }

    @Test
    void test2() {
        String str = "99946";
        String actual = DashInsert.DashInsert2(str);
        System.out.println(actual);

        String expected = "9-9-946";

        Assert.assertEquals(expected, actual);

    }


    @Test
    void test3() {
        String str = "56730";
        String actual = DashInsert.DashInsert2(str);
        System.out.println(actual);

        String expected = "567-30";

        Assert.assertEquals(expected, actual);
    }


    @Test
    void test4() {
        String str = "56730300";
        String actual = DashInsert.DashInsert2(str);
        System.out.println(actual);

        String expected = "567-30300";

        Assert.assertEquals(expected, actual);

    }

}