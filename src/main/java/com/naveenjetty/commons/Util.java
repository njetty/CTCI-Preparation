package com.naveenjetty.commons;

import java.util.Scanner;

/**
 * Created by naveenjetty on 12/29/16.
 */
public class Util {

    static Scanner in = new Scanner(System.in);

    public static String askInputString(String message){
        System.out.print(message);
        String res= in.next();
        return res;
    }
}
