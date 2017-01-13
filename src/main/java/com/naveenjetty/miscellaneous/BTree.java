package com.naveenjetty.miscellaneous;

import java.util.*;

/**
 * Created by naveenjetty on 1/13/17.
 */
public class BTree {
    int data;
    BTree left, right;

    public BTree(int data) {
        this.data = data;
    }

    public void insert(int data) {
        if (this.data < data) {
            //go to right
            if (right != null) {
                right.insert(data);
            } else {
                right = new BTree(data);
            }
        } else {
            if (left != null) {
                left.insert(data);
            } else {
                left = new BTree(data);
            }
        }
    }

    public boolean search(int data) {
        if (this.data == data) return true;
        else if (this.data < data) {
            if (right == null) return false;
            else return right.search(data);
        } else {
            if (left == null) return false;
            else return left.search(data);
        }
    }

    public BTree find(int data){
        if (this.data == data) return this;
        else if (this.data < data) {
            if (right == null) return null;
            else return right.find(data);
        } else {
            if (left == null) return null;
            else return left.find(data);
        }
    }

    public int sum(){
        int val = 0;
        val += left == null? 0:left.sum();
        val += this.data;
        val += right == null? 0:right.sum();
        return val;
    }

    public int height(){
        int lheight = left==null?0:left.height();
        int rheight = right==null?0:right.height();
        return lheight>rheight?lheight+1:rheight+1;

    }


    public void printInOrder(){
        if (left != null) left.printInOrder();
        System.out.print(this.data+" ");
        if (right != null) right.printInOrder();
    }

    public void printLevelOrder(){
        Queue<BTree> q = new ArrayDeque<>();
        q.offer(this);
        while(!q.isEmpty()){
            BTree n = (BTree) q.poll();
            System.out.print(n.data+" ");
            if (n.left != null) q.offer(n.left);
            if (n.right != null) q.offer(n.right);
        }
    }

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        Random r = new Random();
        while (numbers.size()<15){
            numbers.add(r.nextInt(100));
        }
        boolean first  = true;
        BTree bt = null;

        for (int num: numbers){
            System.out.print(num+" ");
            if (first){
                bt = new BTree(num);
                first = false;
            } else{
                bt.insert(num);
            }
        }

        System.out.println();
        bt.printInOrder();
        System.out.println();
        bt.printLevelOrder();
        System.out.println();
        System.out.println(bt.height());
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.print("Enter a number to find or STOP to exit: ");
            String uIn = in.nextLine();
            if (uIn.equalsIgnoreCase("STOP")) break;
            try{
                int val = Integer.parseInt(uIn);
                BTree elem = bt.find(val);
                if (elem == null){
                    System.out.println("Element not found");
                } else {
                    System.out.println(elem.sum());
                }
            } catch (Exception e){
                System.out.println("Invalid Number");
            }
        }

    }
}