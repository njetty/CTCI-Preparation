package com.naveenjetty.DP.lcpsubstring;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by naveenjetty on 1/3/17.
 */
public class BruteForce {
    public String longestPalindrome(String s) {
        Set<String> palins = new LinkedHashSet<String>();
        getList(s,palins);
        String res=null;
        for (String str: palins) {
            if (res==null){
                res=str;
            } else{
                if (res.length()<str.length()) res=str;
            }
        }
        return res;
    }

    public void getList(String s, Set<String> palins){
        if (s==null || s.length()==0) return;
        if (s.length()==1) {
            palins.add(s);
            return;
        }
        if (isPalindrome(s)) {
            palins.add(s);
            return;
        }
        String s1 = s.substring(0,s.length()-1);
        String s2 = s.substring(1);
        getList(s1,palins);
        getList(s2,palins);

    }

    public boolean isPalindrome(String s){
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        BruteForce bf = new BruteForce();
        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        String ps = bf.longestPalindrome(s);
        System.out.println(ps);
    }

}
