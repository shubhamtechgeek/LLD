package com.Sudoku.Entity;

public class Sudoku {

    private int size;

    private int[][] matrix;

    public Sudoku(int dimension) {
        this.size = dimension*dimension;
        matrix = new int[dimension][dimension];
    }
}
