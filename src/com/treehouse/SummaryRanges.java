package com.treehouse;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] ints = {0,1,2,4,5,7};
        System.out.println(summaryRanges(ints));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList();
        for(int i = 0; i<nums.length; i++){
            int start = nums[i];
            while(i + 1 < nums.length && nums[i +1 ]== nums[i] + 1) {
                i++;
            }
            if(nums[i]==start) result.add(""+start);
            else result.add(""+start+"->"+nums[i]);
        }
        return result;
    }

}
