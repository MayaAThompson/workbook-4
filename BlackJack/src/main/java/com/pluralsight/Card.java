package com.pluralsight;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit() {
// only return the suit if the card is face up
        if (isFaceUp) {
            return suit;
        }
        else {
            return "#";
        }
    }

    public String getValue() {
// only return the value if the card is face up
        if (isFaceUp) {
// this is the string value of the card
// i.e. A, K, Q, J, 10, 9 ...
            return value;
        }
        else {
            return "#";
        }
    }

    public int getPointValue() {

        if (isFaceUp) {
            switch (this.value) {
                case "A" -> {
                    return 11;
                }
                case "J", "K", "Q" -> {
                    return 10;
                }
                default -> {
                    return Integer.parseInt(this.value);
                }
            }
        }
        else {
            return 0;
        }
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }
}

