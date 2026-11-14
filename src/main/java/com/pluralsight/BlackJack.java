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
        hand1.deal(blackjack.deal());
        hand1.deal(blackjack.deal());

        Hand hand2 = new Hand();
        hand2.deal(blackjack.deal());
        hand2.deal(blackjack.deal());

        // display card and determine which player is closer to 21
        System.out.println(player1 + "'s hand");
        hand1.print();

        System.out.println(player2 + "'s hand");
        hand2.print();

        int player1Score = hand1.getValue();
        int player2Score = hand2.getValue();

        // declare that player the winner
        if (player1Score <= 21 && (player1Score > player2Score || player2Score > 21)){
            System.out.println(player1 + " wins!");
        } else if (player2Score <= 21 && (player2Score > player1Score || player1Score > 21)) {
            System.out.println(player2 + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
        scanner.close();
    }
}
