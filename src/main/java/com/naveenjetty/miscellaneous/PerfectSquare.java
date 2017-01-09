package com.naveenjetty.miscellaneous;

import com.naveenjetty.commons.Util;

import java.util.*;

/**
 * Created by naveenjetty on 1/9/17.
 */
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            int x = Integer.parseInt(Util.askInputString("Enter an Integer: "));
            System.out.println(makePerfectSquare(x));
        }catch (Exception e){
            System.out.println("Incorrect number format");
            System.exit(0);
        }

    }

    private static int makePerfectSquare(int x) {

        Map<Integer,Integer> primeFactors = getPrimeFactors(x);
        int smallestNumber = 1;
        for(Map.Entry<Integer,Integer> entry: primeFactors.entrySet()){
            if (entry.getValue()%2==1){
                smallestNumber *= entry.getKey();
            }
        }

        return smallestNumber;
    }

    private static Map<Integer,Integer> getPrimeFactors(int n) {
        Map<Integer,Integer> primeFactors = new HashMap<>();
        int d = 2;
        while (d * d <= n){
            boolean factor = false;
            int p = 0;
            while (n % d == 0){
                factor = true;
                n/= d;
                p++;
            }
            if (factor) primeFactors.put(d,p);
            d++;
        }
        if (n > 1){
            primeFactors.put(n,1);
        }
        return primeFactors;
    }
}
