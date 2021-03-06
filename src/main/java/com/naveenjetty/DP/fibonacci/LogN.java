package com.naveenjetty.DP.fibonacci;


/**
 * Created by naveenjetty on 1/3/17.
 * Prints up to 92nd Fibonacci Number
 * Computation takes O(log n)
 */
public class LogN {
    public static void main(String[] args) {
        for (int i=0;i<=92;i++)
            System.out.println(i+": "+fibonacci(i));
    }

    private static long fibonacci(int n){
        if (n < 0) throw new IllegalArgumentException("Cannot be negative");
        if (n<=1) return n;
        long[][] result = {{1,0},{0,1}};
        long[][] fiboM = {{1,1},{1,0}};
        while (n > 0){
            if (n%2 == 1){
                multMatrix(result,fiboM);
            }
            n=n/2;
            multMatrix(fiboM,fiboM);
        }
        return result[1][0];
    }

    private static void multMatrix(long[][] m, long[][] n){
        long a = m[0][0] * n[0][0] +  m[0][1] * n[1][0];
        long b = m[0][0] * n[0][1] +  m[0][1] * n[1][1];
        long c = m[1][0] * n[0][0] +  m[1][1] * n[0][1];
        long d = m[1][0] * n[0][1] +  m[1][1] * n[1][1];

        m[0][0] = a;
        m[0][1] = b;
        m[1][0] = c;
        m[1][1] = d;
    }

}
