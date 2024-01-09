package com.SnakeAndLadder.Entity;

public class Ladder extends BoardEntity {

    public Ladder(int start, int end) {
        super(start, end);
    }


    @Override
    public String getString() {
        return "L : " + this.getStart();
    }
}
