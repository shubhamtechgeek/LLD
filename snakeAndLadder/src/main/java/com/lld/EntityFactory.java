package com.lld;

public class EntityFactory {

    protected static BoardEntity createEntity( Entity entity, int start, int end){
        switch (entity){
            case SNAKE : {
                return new Snake(start, end);
            }
            case LADDER : {
                return new Ladder(start, end);
            }
            default : {
                return null;
            }
        }
    }

}
