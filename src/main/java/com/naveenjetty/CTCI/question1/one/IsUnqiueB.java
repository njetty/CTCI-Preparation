package com.naveenjetty.CTCI.question1.one;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by naveenjetty on 12/29/16.
 */
public class IsUnqiueB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        if (isUnique(s)) System.out.println("Given string has all unique characters");
        else System.out.println("Duplicate characters found");
    }

    private static boolean isUnique(String s) {
        Set<Character> charSet = new HashSet<Character>();
        for(char ch:s.toCharArray()){
            if (charSet.contains(ch)) return false;
            charSet.add(ch);
        }
        return true;
    }
}
