package com.pluralsight;

public class Player {

    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
    }

    public static int selectPlayerCount() {
        System.out.println("Welcome to Jack Black's High Stakes Blackjack!");
        return Integer.parseInt(Utils.messageAndResponse("How many people are playing? "));
    }

    public void addHand(Hand hand) {
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getValue() {
        return this.getHand().getValue();
    }
}
