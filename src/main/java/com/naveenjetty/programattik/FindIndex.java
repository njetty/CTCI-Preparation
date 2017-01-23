package com.naveenjetty.programattik;

/**
 * Created by naveenjetty on 1/20/17.
 */
public class FindIndex {
    public static void main(String[] args) {
        int[] arr = {3,4,7,10,14,20,65};
        System.out.println(findIndex(arr,10));
    }

    public static int findIndex(int[] arr, int val){
        int len = arr.length;
        for (int i =0; i< len; i++){
            if (val == arr[i]) return i;
        }
        return -1;
    }
}
