package com.lld;

public class RandomValueGenerator {
    public static int rollDice(int diceCount) {
        return (int)(1 + Math.random()*6*diceCount);
    }

    public static int randomValue(int min, int max){ return (int) Math.floor(Math.random() * (max - min + 1)) + min; }
}
