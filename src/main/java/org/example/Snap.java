package org.example;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Snap extends CardGame {
    public void playSnap() throws InterruptedException {
        this.shuffleDeck();
        Scanner scanner = new Scanner(System.in);
        ConsoleInput con = new ConsoleInput(
                1,
                2,
                TimeUnit.SECONDS
        );

        System.out.println("Enter Player 1 name");
        Player p1 = new Player(scanner.nextLine());
        System.out.println("Enter Player 2 name");
        Player p2 = new Player(scanner.nextLine());

        boolean gameOver = false;
        ResultMatrix resultMatrix = new ResultMatrix();
        Card card = this.dealCard();
        System.out.println(card);
        Card prevCard;
        String userInput;
        int turn = 0;
        int input;
        int reality;

        while (!gameOver) {
            prevCard = card;
            card = this.dealCard();
            System.out.print(card);
            if (turn == 0) {
                System.out.print(".  It is " + p1.getName() + "'s turn.\n");
            } else {
                System.out.print(".  It is " + p2.getName() + "'s turn.\n");
            }
            userInput = con.readLine();
            if (userInput == null) {
                input = 0;
            } else {
                if (userInput.toLowerCase().matches("snap")) {
                    input = 1;
                } else {
                    input = 0;
                }
            }

            if (card.getValue() == prevCard.getValue()) {
                reality = 1;
            } else {
                reality = 0;
            }
            switch (resultMatrix.getResult(turn, input, reality)) {
                case 1:
                    System.out.println(p1.getName() + " wins!");
                    gameOver = true;
                    break;
                case 2:
                    System.out.println(p2.getName() + " wins!");
                    gameOver = true;
                    break;
            }
            // Check if the deck has run out
            if (deckOfCards.size() == 0) {
                System.out.println("your deck ran out :(");
                gameOver = true;
            }
            // Swap turns
            if (turn == 0) {
                turn = 1;
            } else {
                turn = 0;
            }
        }
    }
}
