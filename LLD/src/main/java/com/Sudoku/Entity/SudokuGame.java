package com.Sudoku.Entity;

import com.Sudoku.SudokuDesignFactory.SudokuFactory;

public class SudokuGame {

    private int dimension;

    private int size;

    Sudoku sudoku;

    public SudokuGame(int dimension) {
        this.dimension = dimension;
        this.size = dimension*dimension;
        sudoku = new SudokuFactory();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[][] getSudoku() {
        return sudoku;
    }

    public void setSudoku(int[][] sudoku) {
        this.sudoku = sudoku;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

}
