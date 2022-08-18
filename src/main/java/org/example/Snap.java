package org.example;

import java.util.Scanner;

public class Snap extends CardGame {
    public void playSnap() {
        this.shuffleDeck();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Player 1 name");
        Player p1 = new Player(scanner.nextLine());
        System.out.println("Enter Player 2 name");
        Player p2 = new Player(scanner.nextLine());

        p1.setMyTurn(true);
        boolean gameOver = false;
        Card card = this.dealCard();
        System.out.println(card);
        Card prevCard;
        String input;
        while (!gameOver) {
            input = scanner.nextLine();
            prevCard = card;
            card = this.dealCard();
            System.out.println(card);
            // Todo implement scoring matrix- see google sheet.
            gameOver = true;
            if (deckOfCards.size() == 0) {
                System.out.println("your deck ran out :(");
                gameOver = true;
            }
            if (p1.isMyTurn()) {
                p1.setMyTurn(false);
                p2.setMyTurn(true);
            } else {
                p1.setMyTurn(true);
                p2.setMyTurn(false);
            }
        }
    }
}
