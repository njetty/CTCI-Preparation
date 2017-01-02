package com.naveenjetty.DP.fibonacci;

import com.naveenjetty.commons.Util;

/**
 * Created by naveenjetty on 1/2/17.
 */
public class Memoization {
    public static void main(String[] args) {
        int n = Integer.parseInt(Util.askInputString("Enter a number"));
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n){
        return fibonacci(n,new int[n+1]);
    }

    private static int fibonacci(int n, int[] mem) {
        if (n==0 || n==1) {
            return n;
        }
        if (mem[n]==0) mem[n] = fibonacci(n-1,mem)+fibonacci(n-2,mem);
        return mem[n];
    }
}
