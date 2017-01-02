package com.naveenjetty.DP.fibonacci;

import com.naveenjetty.commons.Util;

/**
 * Created by naveenjetty on 1/2/17.
 */
public class Recursion {
    public static void main(String[] args) {
        int n = Integer.parseInt(Util.askInputString("Enter a number"));
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
