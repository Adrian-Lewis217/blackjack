package com.pluralsight;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompt for names of players
        System.out.print("Name of Player 1: ");
        String player1 = scanner.nextLine();
        System.out.print("Name of Player 2: ");
        String player2 = scanner.nextLine();
        // create a deck and shuffle
        Deck blackjack = new Deck();
        blackjack.shuffle();
        // deal 2 cards to each hand
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
        hand1.deal(blackjack.deal());
        hand2.deal(blackjack.deal());
        hand1.deal(blackjack.deal());
        hand2.deal(blackjack.deal());

        // display card and determine which player is closer to 21
        hand1.getValue();
        hand2.getValue();
        // declare that player the winner
    }
}
