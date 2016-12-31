package com.naveenjetty.CTCI.question1.five;

import com.naveenjetty.commons.Util;

import static java.lang.Math.abs;

/**
 * Created by naveenjetty on 12/29/16.
 */
public class OneAway {
    public static void main(String[] args) {
        String s1 = Util.askInputString("First String").toLowerCase();
        String s2 = Util.askInputString("Second String").toLowerCase();
        System.out.println(isOneAway(s1,s2));

    }

    private static boolean isOneAway(String s1, String s2) {
        int[] s1arr = new int[26];
        int[] s2arr = new int[26];
        for (int i=0; i<s1.length();i++){
            int val = s1.charAt(i)-'a';
            if (val>=0&&val<=25) s1arr[val]++;
        }
        for (int i=0; i<s2.length();i++){
            int val = s2.charAt(i)-'a';
            if (val>=0&&val<=25) s2arr[val]++;
        }
        int diff=0;
        for (int i=0; i<s1arr.length;i++){
            diff += abs(s1arr[i]-s2arr[i]);
        }
        if (diff == 1){
            return true;
        }
        
        return false;
    }
}
