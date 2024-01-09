package com.SnakeAndLadder.Entity;

public class Snake extends BoardEntity {


    public Snake(int start, int end) {
        super(start, end);
    }

    @Override
    public String getString() {
        return "S : " + this.getStart();
    }
}
