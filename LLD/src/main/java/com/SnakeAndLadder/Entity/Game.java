package com.SnakeAndLadder.Entity;

import com.SnakeAndLadder.Random.RandomValueGenerator;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Game {

    private Queue<Player> playersQueue;

    private Queue<Player> winnerQueue;

    int size;

    int dimension;

    Board board;

    int diceCount;


    public Game(int dimension, int diceCount) {
        this.playersQueue = new LinkedList<Player>();
        this.winnerQueue = new LinkedList<Player>();
        this.size = dimension * dimension;
        this.dimension = dimension;
        this.diceCount = diceCount;
        this.board = new Board(dimension);

    }

    public void newGame() {

        System.out.println("********** Game Started **********");
        System.out.println("**********              **********");

        while (playersQueue.size() > 1) {

            printPlayers();

            Player currentPlayer = playersQueue.poll();

            System.out.println("Press any key to roll the dice for current Player : " + currentPlayer.getName());

            Scanner scan = new Scanner(System.in);
            String keyWord = scan.next();

            int start = 0;
            int current = 0;
            int diceRoll = RandomValueGenerator.rollDice(diceCount);
            current = currentPlayer.getPosition() + diceRoll;
            System.out.println(currentPlayer.getName() + " rolled " + diceRoll);
            movePlayer( currentPlayer, current);

            if (currentPlayer.getPosition() == size) {
                System.out.println(currentPlayer.getName() + " won");
                winnerQueue.add(currentPlayer);
                continue;
            }

            playersQueue.add(currentPlayer);


        }

        printWinnerList();


    }

    private void printWinnerList() {
        AtomicInteger count = new AtomicInteger(1);
        winnerQueue.forEach(player -> {
                    System.out.println(player.getName() + " ranked " + count );
                    count.getAndIncrement();
        }
        );
    }

    private void movePlayer(Player currentPlayer , int current) {
        if(current > size){
            System.out.println("Oops!! Try Again");

        }else if(board.isSnakeOrLadder(current)){
            currentPlayer.setPosition(board.boardCell.get(current).getStart());

        }else{
            currentPlayer.setPosition(current);
        }
    }

    public void addPlayer(Player player1) {

        System.out.println("Player " + player1.getName() + " joined the game");
        playersQueue.add(player1);

    }

    private void printPlayers() {
        playersQueue.forEach(player -> System.out.println(player.getName() + " is at position " + player.getPosition()));
    }
}
