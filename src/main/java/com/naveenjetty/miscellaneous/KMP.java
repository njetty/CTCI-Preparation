package com.naveenjetty.miscellaneous;

import com.naveenjetty.commons.AssortedMethods;

/**
 * Created by naveenjetty on 1/18/17.
 */
public class KMP {
    private final int R;
    private int[][] dfa;
    private String pat;

    public KMP(String pat){
        this.R = 256;
        this.pat = pat;

        //Building the DFA from the given pattern
        int m = pat.length();
        dfa = new int[R][m];
        dfa[pat.charAt(0)][0]=1;
        for (int i = 0, j = 1; j < m; j++){
            for (int c = 0; c < R; c++)
                dfa[c][j] = dfa[c][i];     // Copy mismatch cases.
            dfa[pat.charAt(j)][j] = j+1;   // Set match case.
            i = dfa[pat.charAt(j)][i];     // Update restart state.
        }
    }

    public static void main(String[] args) {
        KMP kmp = new KMP("abracadabra");
        AssortedMethods.printMatrix(kmp.dfa);
    }
}
