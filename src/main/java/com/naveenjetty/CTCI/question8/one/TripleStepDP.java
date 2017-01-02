package com.naveenjetty.CTCI.question8.one;

import com.naveenjetty.commons.Util;

/**
 * Created by naveenjetty on 1/2/17.
 */
public class TripleStepDP {
    public static void main(String[] args) {
        int n = Integer.parseInt(Util.askInputString("Enter number of Steps: "));
        System.out.println(tripleStep(n));
    }

    private static int tripleStep(int n) {
        int[] dp = new int[n];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for(int i=2;i++<n-1;dp[i]=dp[i-1]+dp[i-2]+dp[i-3]);
        return dp[n-1]+dp[n-2]+dp[n-3];
    }
}
