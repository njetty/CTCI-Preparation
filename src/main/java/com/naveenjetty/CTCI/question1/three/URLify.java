package com.naveenjetty.CTCI.question1.three;

import com.naveenjetty.commons.Util;

import java.util.Arrays;

/**
 * Created by naveenjetty on 12/29/16.
 */
public class URLify {
    public static void main(String[] args) {
        String input = Util.askInputString("");
        String[] inputArr = input.split(",");
        String s = inputArr[0];
        int len = Integer.parseInt(inputArr[1]);
        System.out.println(urlify(s,len));
    }

    private static String urlify(String s, int len) {
        char[] chars = s.toCharArray();
        int k = chars.length-1;
        int j = len-1;
        while (j >= 0) {
            if (chars[j]==' '){
                chars[k--]='0';
                chars[k--]='2';
                chars[k--]='%';
            }else chars[k--]=chars[j];
            j--;
        }
        return String.valueOf(chars);
    }
}
