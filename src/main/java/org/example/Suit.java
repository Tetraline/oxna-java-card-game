package org.example;

public enum Suit {
    SPADES('♠'),HEARTS('♥'), DIAMONDS('♦'), CLUBS('♣');
    private char c;
    Suit(char c) {
       this.c = c;
    }

    public char getC() {
        return c;
    }
}
