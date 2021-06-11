package com.treehouse;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] ints = {1,5,10}; // 2
        int[] intsZero = {0};
        int[] intsRandom = {22, 12, 3, 5, 9};

        int target = 11;


        System.out.println(coinChangeDp(intsRandom, target));
    }

    // This is the solution I came up with which fails some test cases..
    public static int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        if(coins.length == 0) return -1;

        int fewestNumCoins = 0;
        int end = coins.length -1;

        int remainingAmount = amount;

        while(0 <= end) {
            if(amount >= coins[end]) {
                while(remainingAmount >= coins[end]) {

                    remainingAmount -= coins[end];
                    fewestNumCoins++;
                    System.out.println("FewestCoins: " + fewestNumCoins);
                    System.out.println("Remaining Amt: " + remainingAmount);

                    if(remainingAmount == 0) return fewestNumCoins;

                }
            }
            end--;
        }
        return -1;
    }



    // Correct Dynamic Programming Answer
    public static int coinChangeDp(int[] coins, int amount) {
        int[] pastNumCoins = new int[amount + 1]; // new array 1 greater than amount (to account for 0)
        Arrays.fill(pastNumCoins, amount + 1); // all values need to be greater than our amount - so we can assign if there is a lower value
        pastNumCoins[0] = 0; // set the first array element to 0.. WHY??

        for(int counter = 0; counter <= amount; counter++) { // go through up to amount. counter is our coin counter
            for (int coin : coins) { // look at each coin's value
                if (coin <= counter) { // if this coin is less than or equal to our amount
                    if((pastNumCoins[counter - coin] + 1) < pastNumCoins[counter])
                        pastNumCoins[counter] = pastNumCoins[counter - coin] + 1; // keep setting our coin until coins[j] is > than counter
                }
            }
        }
        if(pastNumCoins[amount] == amount + 1) return - 1; // check and see if we changed the value or if it is still the default
        else return pastNumCoins[amount];
    }



    public static int coinChangeDpOptimized(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] calc = new int[amount + 1];
        Arrays.fill(calc, amount + 1);
        calc[0] = 0;
        System.out.println(Arrays.toString(calc));

        for(int i = 0; i <= amount; i++) { // go through up to amount
            for(int j = 0; j < coins.length; j++) { // look at each coin
                if(coins[j] <= i) calc[i] = Math.min(calc[i], 1 + calc[i - coins[j]]);
                else break;
            }
        }
        System.out.println(Arrays.toString(calc));
        return calc[amount] > amount ? -1 : calc[amount];
    }

    public static int coinChange3(int[] coins, int amount) {
        if (amount < 1) return 0;
        return coinChangeHelper(coins, amount, new int[amount]);
    }

    private static int coinChangeHelper(int[] coins, int rem, int[] count) {
        if (rem < 0) return -1; // top down - these are recursive base cases
        if (rem == 0) return 0;
        if (count[rem - 1] != 0) return count[rem - 1];
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = coinChangeHelper(coins, rem - coin, count);
            if (res >= 0 && res < min)
                min = 1 + res;
        }
        count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return count[rem - 1];
    }

}
