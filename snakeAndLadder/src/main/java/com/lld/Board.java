package com.lld;

import java.util.*;

public class Board {

    int size;

    HashMap<Integer, BoardEntity> boardCell;


    public Board(int dimension) {
        this.size = dimension * dimension;
        this.boardCell = new HashMap<>();

        for (int i = 0; i < dimension; i++) {

            //adding a ladder
            int min = 2; int max = this.size-2;
            int start = RandomValueGenerator.randomValue(min, max);
            max = start - 1;
            int end = RandomValueGenerator.randomValue(min, max);

            if(!isSnakeOrLadder(end)){
                addNewSnakeOrLadder(end, EntityFactory.createEntity(Entity.LADDER, start, end));
            }

            //adding a snake
            min = 2; max = this.size-1;
            end = RandomValueGenerator.randomValue(min, max);
            max = end - 1;
            start = RandomValueGenerator.randomValue(min, max);

            if(!isSnakeOrLadder(end)){
                addNewSnakeOrLadder(end, EntityFactory.createEntity(Entity.SNAKE, start, end));
            }
        }
        
        printBoard(size, dimension);

    }

    private void printBoard(int size, int dimension) {

        for (int i = size-1; i > 0 ; i--) {

            if(isSnakeOrLadder(i)){
                System.out.println(this.boardCell.get(i).getString() + " ");

                continue;
            }

            System.out.println(i + " ");


            if (i % dimension == 0) {
                System.out.println();
            }

        }
        System.out.println();

    }

    protected boolean isSnakeOrLadder(int index){ return this.boardCell.containsKey(index); }
    private void addNewSnakeOrLadder(int index, BoardEntity entity){ this.boardCell.put(index, entity); }
}
