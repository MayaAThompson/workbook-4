package com.pluralsight;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Player> players = new ArrayList<>();
        int playerCount = Player.selectPlayerCount();

        Deck deck = new Deck();
        deck.shuffle();

        for (int i = 0; i < playerCount; i++) { //create each player and add them to the ArrayList
            Player player = new Player(Utils.messageAndResponse("Player " + (i + 1) + " name: "));
            players.add(player);
        }

        for (Player player : players) { //Deal 2 cards to each player's hand
            Hand hand = new Hand();
            for (int i = 0; i < 2; i++) {
                hand.addCard(deck.deal());
            }
            player.addHand(hand);
        }

        Player winner = null;
        for (Player player : players) {
            if (player.getHand().getValue() > 21) {
                System.out.println(player.getName() + " busted!");
                continue;
            }
            if (winner == null) {
                winner = player;
               }
            else {
                if (player.getHand().getValue() > winner.getHand().getValue()) {
                    winner = player;
                }
            }
        }

        if (winner != null) {
            System.out.println(winner.getName() + " won! with: " + winner.getHand().getValue());
        }
        else {
            System.out.println("The house wins! >:D");
        }
    }
}
