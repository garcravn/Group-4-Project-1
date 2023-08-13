/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author kaurg
 */
public class WarPlayer extends Player{
    
    private Deck playerDeck; // The deck of cards for the player
    private Deck opponentDeck; // The deck of cards for the opponent
    public WarPlayer(String name, Deck playerDeck, Deck opponentDeck) {
        super(name);
        this.playerDeck = playerDeck;
        this.opponentDeck = opponentDeck;
    }
    @Override
    public void play() {

        System.out.println(getName() + " is playing War.");
        // Simulate a war scenario 
        Card playerCard = drawPlayerCard(playerDeck);
        Card opponentCard = drawOpponentCard(opponentDeck);
        
        int comparison = playerCard.compare(opponentCard);
        
        if (comparison == 0) {
            System.out.println("It's a tie! Initiating a war scenario...");
            
            // Draw additional cards for the war
            Card[] playerWarCards = new Card[3];
            Card[] opponentWarCards = new Card[3];
            
            for (int i = 0; i < 3; i++) {
                playerWarCards[i] = drawPlayerCard(playerDeck);
                opponentWarCards[i] = drawOpponentCard(opponentDeck);
            }
            
            // Compare the war cards
            int warComparison = playerWarCards[2].compare(opponentWarCards[2]);
            
            if (warComparison > 0) {
                // Player wins the war
                System.out.println(getName() + " wins the war!");
                // Handle awarding cards to the player
            } else if (warComparison < 0) {
                // Opponent wins the war
                System.out.println(getName() + " loses the war.");
                // Handle awarding cards to the opponent
            } else {
                // Another tie in the war
                System.out.println("Another tie in the war.");
            }
        } else {
            // Regular comparison (not a tie)
            if (comparison > 0) {
                System.out.println(getName() + " wins this round!");
                // Handle awarding cards to the player
            } else {
                System.out.println(getName() + " loses this round.");
                // Handle awarding cards to the opponent
            }
        }

        // ...
    }
    
        private Card drawPlayerCard(Deck playerDeck) {
    
             return playerDeck.drawCard();
}

        private Card drawOpponentCard(Deck opponentDeck) {
    
                return opponentDeck.drawCard();
}

 
    }

