/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author harkirat
 */
public abstract class Card {
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
    public abstract String toString();
    
     private int rank;
   
     
       public Card(int rank) {
        this.rank = rank;
      
    }
      public int getRank() {
        return rank;
    }

    

    /**
     * Compares two cards based on their rank.
     *
     * @param otherCard The card to compare with
     * @return Negative value if this card's rank is less, positive value if greater, 0 if equal
     */
    public int compare(Card otherCard) {
        return Integer.compare(this.rank, otherCard.rank);
    }

   
   
}
