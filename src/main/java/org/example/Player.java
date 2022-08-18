package org.example;

public class Player {
    private String name;
    private boolean myTurn;
    public Player(String name) {
        this.name = name;
        this.myTurn = false;
    }

    public String getName() {
        return name;
    }

    public boolean isMyTurn() {
        return myTurn;
    }

    public void setMyTurn(boolean myTurn) {
        this.myTurn = myTurn;
    }
}
