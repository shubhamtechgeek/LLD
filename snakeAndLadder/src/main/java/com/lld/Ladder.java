package com.lld;

public class Ladder extends BoardEntity{

    public Ladder(int start, int end) {
        super(start, end);
    }


    @Override
    public String getString() {
        return "L : " + this.getStart();
    }
}
