package com.naveenjetty.DP.lcpsubstring;

/**
 * Created by naveenjetty on 1/3/17.
 */
public class Simple {
    int maxLen,  li;

    public String longestPalindrome(String s) {
        if (s==null || s.length()==0) return null;
        int len = s.length();
        if (len==1) return s;
        for(int i=0;i<len;i++){
            extendPalindrome(s,i,i);
            extendPalindrome(s,i,i+1);
        }
        return s.substring(li,li+maxLen);
    }

    void extendPalindrome(String s,int j, int k){
        while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k)){
            j--;
            k++;
        }
        if (maxLen < k-j-1){
            li = j+1;
            maxLen = k-j-1;
        }
    }

    public static void main(String[] args) {
        Simple bf = new Simple();
        String s = "civilwartestingwhetherthatnaptionoranyn";
        String ps = bf.longestPalindrome(s);
        System.out.println(ps);
    }
}
