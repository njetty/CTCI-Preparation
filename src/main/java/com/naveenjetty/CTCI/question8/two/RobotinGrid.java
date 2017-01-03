package com.naveenjetty.CTCI.question8.two;

import com.naveenjetty.commons.AssortedMethods;

import java.util.ArrayList;

/**
 * Created by naveenjetty on 1/2/17.
 */

public class RobotinGrid {
    public static void main(String[] args) {
        int size = 5;
        boolean[][] maze = AssortedMethods.randomBooleanMatrix(size, size, 70);

        AssortedMethods.printMatrix(maze);

        ArrayList<Point> path = getPath(maze);
        if (path != null) {
            System.out.println(path.toString());
        } else {
            System.out.println("No path found.");
        }
    }

    private static ArrayList<Point> getPath(boolean[][] maze) {
        if (maze==null||maze.length==0) return null;
        ArrayList<Point> path = new ArrayList<Point>();
        if (getPath(maze,maze.length-1,maze[0].length-1,path)){
            return path;
        }
        else return null;
    }

    private static boolean getPath(boolean[][] maze, int row, int col, ArrayList<Point> path) {
        if (row<0||col<0||!maze[row][col]) return false;
        boolean isAtOrigin = row==0 && col==0;
        if (isAtOrigin || getPath(maze,row-1,col,path) || getPath(maze,row,col-1,path)) {
            path.add(new Point(row,col));
            return true;
        }
        return false;
    }


}
