package com.naveenjetty.DS.implementations.basic;

/**
 * Created by naveenjetty on 12/30/16.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,5,4,7,2,9,10,14,19,21,62,20};
        sort(arr,"DESC");
        for (int i: arr) System.out.print(i+" ");

    }
    public static void sort(int[] arr){
        sort(arr,"ASC");
    }
    public static void sort(int[] arr, String order){
        int len = arr.length;
        if (!order.equalsIgnoreCase("ASC") && !order.equalsIgnoreCase("DSC")) {
            System.out.println("Incorrect Order Flag, Exit without sorting"); return;
        }
        for (int i=0;i<len;i++){
            boolean swapped = false;
            for (int j=0;j<len-1;j++){
                boolean doSwap = false;
                if ((arr[j]>arr[j+1] && order.equalsIgnoreCase("ASC")) ||
                        (arr[j]<arr[j+1] && order.equalsIgnoreCase("DSC")))
                    doSwap = true;

                if (doSwap){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
