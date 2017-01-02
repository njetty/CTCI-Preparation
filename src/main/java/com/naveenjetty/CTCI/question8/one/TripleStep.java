package com.naveenjetty.CTCI.question8.one;

import com.naveenjetty.commons.Util;

/**
 * Created by naveenjetty on 1/2/17.
 */
public class TripleStep {
    public static void main(String[] args) {
        int n = Integer.parseInt(Util.askInputString("Enter number of Steps: "));
        System.out.println(tripleStep(n));
    }

    private static int tripleStep(int n) {
        int a=1,b=1,c=2,d=0;
        if (n<3) return n;
        for(int i=3;i<=n;i++){
            d=a+b+c;
            a=b;b=c;c=d;
        }
        return d;
    }
}
