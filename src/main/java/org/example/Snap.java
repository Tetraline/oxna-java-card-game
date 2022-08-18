package org.example;

import java.util.Scanner;

public class Snap extends CardGame {
    public void playSnap() {
        this.shuffleDeck();
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;
        Card card = this.dealCard();
        System.out.println(card);
        Card prevCard;
        while (!gameOver) {
            scanner.nextLine();
            prevCard = card;
            card = this.dealCard();
            System.out.println(card);
            if (prevCard.getValue() == card.getValue()) {
                System.out.println("SNAP!!");
                gameOver = true;
            }
            if (deckOfCards.size() == 0) {
                System.out.println("your deck ran out :(");
                gameOver = true;
            }
        }
    }
}
