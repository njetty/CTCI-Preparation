package com.ds.implementations;

/**
 * Created by naveenjetty on 12/27/16.
 */

public class BTree {
    BTree left, right;
    int data;
    public BTree(int data){
        this.data = data;
    }

    public void insert(int value){
        if (value < data){
            if (left == null) left = new BTree(value);
            else left.insert(value);
        } else {
            if (right == null) right = new BTree(value);
            else right.insert(value);
        }
    }

    public boolean contains(int value){
        if (value== data) return true;
        if (value < data){
            if (left == null) return false;
            return left.contains(value);
        } else {
            if (right == null) return false;
            return right.contains(value);
        }
    }

    public void printInorder(){
        if (left!=null) left.printInorder();
        System.out.print(data+" ");
        if (right!=null) right.printInorder();
    }

    public static void main(String[] args) {
        int[] a= {3,8,2,6,4,1,12,15,11,56};
        BTree bt = new BTree(a[0]);
        for (int i = 1; i<a.length; i++){
            bt.insert(a[i]);
        }
        bt.printInorder();
    }
}
