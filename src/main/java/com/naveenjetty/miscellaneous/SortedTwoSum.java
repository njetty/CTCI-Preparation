package com.naveenjetty.miscellaneous;

import java.util.Arrays;

/**
 * Created by naveenjetty on 1/10/17.
 */
public class SortedTwoSum {
    public static void main(String[] args) {
        int[] input = {2,5,6,7,8,13,14,16};
        System.out.println(Arrays.asList(twoSum(input,10)));

    }

    public static int[] twoSum(int[] input, int target){
        int i,j;
        // Start at the beginning and end of the array
        i=0;
        j=input.length-1;

        while (i < j){
            int sum = input[i] + input[j];
            if (sum < target){
                // We need to increase i
                i++;
            } else if (sum > target){
                // We need to decrease j
                j--;
            } else {
                // We found the target
                return new int[] {i+1,j+1};
            }
        }
        throw new IllegalArgumentException("No sum equals to the given target");
    }
}
