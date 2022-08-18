package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardGame {
    ArrayList<Card> deckOfCards;

    public CardGame() {
        deckOfCards = new ArrayList<Card>();
        for (Suit s : Suit.values()) {
            for (int i = 2; i < 15; i++) {
                deckOfCards.add(new Card(s, (byte) i));
            }
        }
    }

    public void printDeck() {
        for (Card card :
                deckOfCards) {
            System.out.println(card);
        }
        System.out.println("Cards in deck: " + deckOfCards.size());

    }


    /**
     * Remove the first card and return it
     *
     * @return The removed card.
     */
    public Card dealCard() {
        return deckOfCards.remove(0);
    }

    public void sortDeckInNumberOrder() {
        Collections.sort(deckOfCards, Comparator.comparingInt(Card::getValue));
    }

    public void sortDeckIntoSuits() {
        Collections.sort(deckOfCards, Comparator.comparing(Card::getSuit).thenComparing(Card::getValue));
    }

    public void shuffleDeck(){
        Collections.shuffle(deckOfCards);
    }
}
