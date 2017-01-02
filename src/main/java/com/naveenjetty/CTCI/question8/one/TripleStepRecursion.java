package com.naveenjetty.CTCI.question8.one;

import com.naveenjetty.commons.Util;

/**
 * Created by naveenjetty on 1/2/17.
 */
public class TripleStepRecursion {
    public static void main(String[] args) {
        int n = Integer.parseInt(Util.askInputString("Enter number of Steps: "));
        System.out.println(tripleStep(n));
    }

    private static int tripleStep(int n) {
        if(n<0) return 0;
        if(n==0) return 1;
        return tripleStep(n-1)+tripleStep(n-2)+tripleStep(n-3);
    }
}
