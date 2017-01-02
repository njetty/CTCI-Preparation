package com.naveenjetty.DP.fibonacci;

import com.naveenjetty.commons.Util;

/**
 * Created by naveenjetty on 1/2/17.
 */
public class DPwithoutArray {
    public static void main(String[] args) {
        int n = Integer.parseInt(Util.askInputString("Enter a number: "));
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n){
        int a=0,b=1,c=0;
        if (n==0||n==1) return n;
        for (int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}

