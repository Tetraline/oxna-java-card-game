package org.example;

public class Card {
    private Suit suit;
    private byte value;

    public Card(Suit suit, byte value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card " + this.getSymbol() + " of " + suit;
    }

    public String getSymbol() {
        if (value <= 10) {
            return Integer.toString(value);
        } else {
            switch (value) {
                case 11:
                    return "J";
                case 12:
                    return "Q";
                case 13:
                    return "K";
                case 15:
                    return "A";
            }
        }
        return "#";
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public byte getValue() {
        return value;
    }

    public void setValue(byte value) {
        this.value = value;
    }
}
