package com.naveenjetty.CTCI.question1.two;

import com.naveenjetty.commons.Util;

import java.util.Scanner;

/**
 * Created by naveenjetty on 12/29/16.
 */
public class Permutation {
    public static void main(String[] args) {
        String s1 = Util.askInputString("First String: ");
        String s2 = Util.askInputString("Second String: ");

        if (areAnagrams(s1,s2)) System.out.println("The two strings are anagrams");
        else System.out.println("Not permutation of each other");
    }

    private static boolean areAnagrams(String s1, String s2) {
        if (s1.length()==s2.length()) return false;
        int[] charCounts = new int[128];
        for (int i:s1.toCharArray()){
            charCounts[i]++;
        }
        for (int i:s2.toCharArray()){
            charCounts[i]--;
            if (charCounts[i]<0) return false;
        }
        return true;
    }

}
