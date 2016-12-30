package com.naveenjetty.CTCI.question1.four;

import com.naveenjetty.commons.Util;

import java.util.Arrays;

/**
 * Created by naveenjetty on 12/29/16.
 */
public class PalindromePermutation {
    public static void main(String[] args) {
        String s = Util.askInputString("").toLowerCase();
        if (isPalindromePermutation(s)) System.out.println("true"); else System.out.println("false");
    }

    private static boolean isPalindromePermutation(String s) {
        int[] charCounts = new int[26];
        int len=0;
        for (int i =0; i< s.length();i++){
            int j = s.charAt(i) - 'a';
            if (j>=0&&j<=25){
                charCounts[j]+=1;
                len++;
            }
        }
        int oddCount = 0;
        for (int i = 0; i < charCounts.length;i++){
            if (charCounts[i]%2==1){
                oddCount ++;
            }
        }

        if (len%2==1){
            if (oddCount==1) return true;
            else return false;
        }else{
            if (oddCount==0) return true;
            else return false;
        }
    }
}
