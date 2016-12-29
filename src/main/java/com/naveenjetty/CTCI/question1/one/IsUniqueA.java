package com.naveenjetty.CTCI.question1.one;

import java.util.Scanner;

/**
 * Created by naveenjetty on 12/29/16.
 * IS Unique: Implement an algorithm to determine if a string has all unique characters
 */
public class IsUniqueA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        if (isUnique(s)) System.out.println("Given string has all unique characters");
        else System.out.println("Duplicate characters found");
    }

    private static boolean isUnique(String s) {
        int val, checker=0;
        for(int i=0; i<s.length();i++){
            val = s.charAt(i)-'A';
            if ((checker & (1<<val)) !=0) return false;
            checker |= (1<<val);
        }
        return true;
    }
}
