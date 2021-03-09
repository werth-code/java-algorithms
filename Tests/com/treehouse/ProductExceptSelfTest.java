package com.treehouse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ProductExceptSelfTest {
    int[] test1;

    @Before
    public void setUp() throws Exception {
        test1 = new int[]{1, 2, 3, 4};
    }

    @Test
    public void productExceptSelf() {
        String actual = Arrays.toString(ProductExceptSelf.productExceptSelf(test1));
        String expected = Arrays.toString(new int[]{24, 12, 8, 6});

        System.out.println("ACTUAL: " + actual);
        System.out.println("EXPECTED: " + expected);

        Assert.assertEquals(actual, expected);
    }
}