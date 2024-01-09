package com.SnakeAndLadder.Factory;

import com.SnakeAndLadder.Entity.BoardEntity;
import com.SnakeAndLadder.Entity.Entity;
import com.SnakeAndLadder.Entity.Snake;
import com.SnakeAndLadder.Entity.Ladder;

public class EntityFactory {

    public static BoardEntity createEntity(Entity entity, int start, int end){
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
