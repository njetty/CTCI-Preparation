package com.naveenjetty.commons;

import java.util.Scanner;

/**
 * Created by naveenjetty on 12/29/16.
 */
public class Util {

    public static String askInputString(String message){
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        String res= in.next();
        in.close();
        return res;
    }
}
