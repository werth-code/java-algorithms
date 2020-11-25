package com.treehouse;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FindOddIntTest {

    @Test
    public void findTest() {
        int actual = FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5});
        Assert.assertEquals(5,actual);
    }

    @Test
    public void findTest2() {
        int actual = FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5});
        Assert.assertEquals(-1,actual);
    }

    @Test
    public void findTest3() {
        int actual = FindOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5});
        Assert.assertEquals(5,actual);
    }

    @Test
    public void findTest4() {
        int actual = FindOdd.findIt(new int[]{10});
        Assert.assertEquals(10 ,actual);
    }

    @Test
    public void findTest5() {
        int actual = FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1});;
        Assert.assertEquals(10 ,actual);
    }

}