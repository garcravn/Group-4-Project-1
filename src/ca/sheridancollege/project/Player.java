/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * author Ravneet aug,2023
 */

package ca.sheridancollege.project;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * 
 * @author Ravneet Aug,2023
 */
public abstract class Player {

    private String name; //the unique name for this player
     private List<Card> deck; // Player's deck of cards

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
         this.deck = new ArrayList<>();
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    public List<Card> getDeck() {
        return deck;
    }
    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }
    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    public abstract void play();
    
    public void addCardToDeck(Card card) {
        deck.add(card);
    }

    public void removeCardFromDeck(Card card) {
        deck.remove(card);
    }

}
