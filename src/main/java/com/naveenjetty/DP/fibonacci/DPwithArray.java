package com.naveenjetty.DP.fibonacci;

import com.naveenjetty.commons.Util;

import java.util.Arrays;

/**
 * Created by naveenjetty on 1/2/17.
 */
public class DPwithArray {
    public static void main(String[] args) {
        int n = Integer.parseInt(Util.askInputString("Enter a number"));
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n){
        int[] mem = new int[n];
        mem[0]=0;
        mem[1]=1;
        for(int i=1;i++<n-1;mem[i]=mem[i-1]+mem[i-2]);
        return mem[n-1]+mem[n-2];
    }
}
