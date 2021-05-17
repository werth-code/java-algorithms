package com.treehouse;

public class TrappingWaterSimple {

    // take an int[] of num values and return the greatest volume of water which can be stored within two boundaries.
    // [ 7, 1, 2, 3, 9 ]   7--9 --- if we go above 7 it will overflow so it would be 7 x distanceApart (4) = 28.
    // [ 3, 6, 5, 6, 2 ]   6--6 --- 12

    // [] or [1] value cannot hold volume so --> 0;

    // go through and check for volumes.
    // we want the max so.. if a num is greater, check for value.

    // improve this solution ----> could we iterate based solely on which pointer is greater?

    public static void main(String[] args) {

        int[] ints  = {7,1,2,3,9}; //-> ex 28
        int[] ints2 = {}; // -> 0
        int[] ints3 = {1}; // -> 0
        int[] ints4 = {4,8,1,2,3,9}; //-> ex 12

        System.out.println(trapWater2(ints));
        System.out.println(trapWater2(ints2));
        System.out.println(trapWater2(ints3));
        System.out.println(trapWater2(ints4));

    }

    //        int[] ints = {7,1,2,3,9}; //-> ex 28
    //        int[] ints2 = {}; // -> 0
    //        int[] ints3 = {1}; // -> 0

    public static int trapWater2(int[] levels) {
        if(levels.length < 2) return 0;
        int totalVolume = 0;

        int p1 = 0;
        int p2 = levels.length - 1;

        while(p1 < p2) {  // remember to have all of the variables which need to update INSIDE of the loop.
            int distance = p2 - p1;
            int height = Math.min(levels[p1], levels[p2]);
            totalVolume = Math.max((height * distance), totalVolume);

            if(levels[p2 - 1] > levels[p1 + 1]) p2--;
            else p1++;
        }

        return totalVolume;
    }

}
