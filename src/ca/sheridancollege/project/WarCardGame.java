/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author kaurg
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WarCardGame extends Game {

    private Player player1;
    private Player player2;
    private Deck deck;

    public WarCardGame() {
       super("War Card Game");
        
        deck = new Deck();
        deck.shuffle();
        
        Deck player1Deck = new Deck();
        Deck player2Deck = new Deck();
        
        distributeCards(player1Deck, player2Deck);

        player1 = new WarPlayer("Player 1", player1Deck, player2Deck);
        player2 = new WarPlayer("Player 2", player2Deck, player1Deck);
    }

    @Override
    public void play() {
    while (!isGameOver()) {
        System.out.println("Starting a new round...");
        playRound();
        System.out.println("Round complete.");
    }
    System.out.println("Game over.");
}


    @Override
    public void declareWinner() {
        if (player1.getDeck().isEmpty()) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Player 1 wins!");
        }
    }

    private void distributeCards(Deck player1Deck, Deck player2Deck) {
    List<Card> allCards = deck.getCards();
    
    for (int i = 0; i < allCards.size(); i++) {
        if (i % 2 == 0) {
            player1Deck.addCard(allCards.get(i));
        } else {
            player2Deck.addCard(allCards.get(i));
        }
    }
}


    private void playRound() {
        System.out.println("start");
        Card player1Card = drawCard(player1);
        Card player2Card = drawCard(player2);

        System.out.println(player1.getName() + " plays: " + player1Card);
        System.out.println(player2.getName() + " plays: " + player2Card);

        int comparison = player1Card.compare(player2Card);

        if (comparison > 0) {
            player1.addCardToDeck(player2Card);
            player1.addCardToDeck(player1Card);
            System.out.println(player1.getName() + " wins the round!");
        } else if (comparison < 0) {
            player2.addCardToDeck(player1Card);
            player2.addCardToDeck(player2Card);
            System.out.println(player2.getName() + " wins the round!");
        } else {
            System.out.println("war");
            initiateWar();
        }
    }

    private Card drawCard(Player player) {
        Card drawnCard = player.getDeck().get(0);
        player.removeCardFromDeck(drawnCard);
        return drawnCard;
    }

    private void initiateWar() {
        System.out.println("It's a tie! Initiating a war scenario...");

        List<Card> player1WarCards = new ArrayList<>();
        List<Card> player2WarCards = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            player1WarCards.add(drawCard(player1));
            player2WarCards.add(drawCard(player2));
        }

        Card player1Card = drawCard(player1);
        Card player2Card = drawCard(player2);

        player1WarCards.add(player1Card);
        player2WarCards.add(player2Card);

        int comparison = player1Card.compare(player2Card);

        if (comparison > 0) {
            player1.getDeck().addAll(player1WarCards);
            player1.getDeck().addAll(player2WarCards);
            System.out.println(player1.getName() + " wins the war!");
        } else if (comparison < 0) {
            player2.getDeck().addAll(player1WarCards);
            player2.getDeck().addAll(player2WarCards);
            System.out.println(player2.getName() + " wins the war!");
        } else {
            playWar();
        }
    }

    private void playWar() {
        System.out.println("Another tie! Another war!");

        List<Card> player1WarCards = new ArrayList<>();
        List<Card> player2WarCards = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            player1WarCards.add(drawCard(player1));
            player2WarCards.add(drawCard(player2));
        }

        int comparison = player1WarCards.get(2).compare(player2WarCards.get(2));

        if (comparison > 0) {
            player1.getDeck().addAll(player1WarCards);
            player1.getDeck().addAll(player2WarCards);
            System.out.println(player1.getName() + " wins the war!");
        } else if (comparison < 0) {
            player2.getDeck().addAll(player1WarCards);
            player2.getDeck().addAll(player2WarCards);
            System.out.println(player2.getName() + " wins the war!");
        } else {
            System.out.println("It's still a tie! The war continues...");
            playWar();
        }
    }

    private boolean isGameOver() {
        return player1.getDeck().isEmpty() || player2.getDeck().isEmpty();
    }

   
}

