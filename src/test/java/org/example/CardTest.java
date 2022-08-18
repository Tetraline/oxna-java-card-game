package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CardTest {
    private Card target;

    public CardTest() {
        System.out.println("Creating new CardTest!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Creating new Card");
        this.target = new Card(Suit.HEARTS, (byte) 2);
    }

    @Test
    @DisplayName("Card method getSymbol correctly functions")
    void getSymbol_normal_returnsCorrectSymbol() {
        assertEquals("2", target.getSymbol());
        Card card1 = new Card(Suit.HEARTS, (byte) 10);
        Card card2 = new Card(Suit.HEARTS, (byte) 11);
        Card card3 = new Card(Suit.HEARTS, (byte) 15);
        assertEquals("10", card1.getSymbol());
        assertEquals("J", card2.getSymbol());
        assertEquals("A", card3.getSymbol());
    }
}
