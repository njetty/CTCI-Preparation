package com.naveenjetty.CTCI.question8.two;


/**
 * Created by naveenjetty on 1/2/17.
 */
public class Point {
    private int row,column;
    public Point(int row, int column){
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString(){
        return "(" + row + ", " + column + ")";
    }

    @Override
    public boolean equals(Object o){
        if ((o instanceof Point) && ((Point) o).row == this.row &&  ((Point) o).column == this.column) return true;
        return false;
    }

}
