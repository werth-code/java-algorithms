package com.treehouse;


//Dash Insert
//Have the function DashInsert(str) insert dashes ('-') between each two odd numbers in str.
//For example: if str is 454793 the output should be 4547-9-3. Don't count zero as an odd number.
//Examples
//Input: 99946
//Output: 9-9-946
//Input: 56730
//Output: 567-30

public class DashInsert {

    public static String DashInsert(String str) {
        char[] nums = str.toCharArray();
        String result = "";

        for(int i = 1; i < nums.length; i++) {
            int prev = Character.getNumericValue(nums[i-1]);
            int current = Character.getNumericValue(nums[i]);
            result += prev;

            if(prev % 2 != 0 && current % 2 != 0 && nums[i] != '0') {
                result += "-";
            }
        }
        result += nums[nums.length - 1];
        return result;
    }
}
