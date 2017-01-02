package com.naveenjetty.CTCI.question8.one;

import com.naveenjetty.commons.Util;

import java.util.Arrays;

/**
 * Created by naveenjetty on 1/2/17.
 */
public class TripleStepMemoization {
    public static void main(String[] args) {
        int n = Integer.parseInt(Util.askInputString("Enter number of Steps: "));
        System.out.println(tripleStep(n));
    }

    public static int tripleStep(int n) {
        int[] map = new int[n + 1];
        Arrays.fill(map, -1);
        return tripleStep(n, map);
    }

    public static int tripleStep(int n, int[] memo) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (memo[n] > -1) {
            return memo[n];
        } else {
            memo[n] = tripleStep(n - 1, memo) + tripleStep(n - 2, memo) + tripleStep(n - 3, memo);
            return memo[n];
        }
    }

}
