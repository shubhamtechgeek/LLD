package com.SnakeAndLadder;

import com.SnakeAndLadder.Entity.Game;
import com.SnakeAndLadder.Entity.Player;

/**
 * Hello world!
 *
 */
public class LaunchGame
{
    public static void main( String[] args )
    {
        Game game = new Game(10, 2);

        Player player1=  new Player("A");
        Player player2=  new Player("B");
        Player player3=  new Player("C");
        Player player4=  new Player("D");

        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);
        game.addPlayer(player4);

        game.newGame();

    }
}
