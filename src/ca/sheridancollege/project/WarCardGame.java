/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author kaurg
 */
public class WarCardGame extends Game {
   // Constructor for WarCardGame class
    public WarCardGame() {
        super("War Card Game"); // Set the game's name as "War Card Game"
    }

    // Implement the play() method for the War card game logic
    @Override
    public void play() {
        // Implement the game logic for the War card game
        // For example, handle turns, cards, comparisons, etc.
        System.out.println("Playing the War Card Game!");
    }

    // Implement the declareWinner() method to determine and display the winner
    @Override
    public void declareWinner() {
        // Implement how you determine the winner of the War card game and display the result
        System.out.println("The winner of the War Card Game is...");
    } 
}
