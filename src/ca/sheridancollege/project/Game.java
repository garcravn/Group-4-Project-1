/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Game {

    private final String name;//the title of the game
    private ArrayList<RegisteredPlayer> registeredPlayers;// the players of the game

    public Game(String name) {
        this.name = name;
        registeredPlayers = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<RegisteredPlayer> getRegisteredPlayers() {
        return registeredPlayers;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<RegisteredPlayer> players) {
        this.registeredPlayers = players;
    }
     public void registerPlayers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to " + getName());

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter Player " + (i + 1) + "'s username: ");
            String username = scanner.nextLine();
            System.out.print("Enter Player " + (i + 1) + "'s password: ");
            String password = scanner.nextLine();

            User user = new User(username, password);
            RegisteredPlayer registeredPlayer = new RegisteredPlayer(username, user);
            registeredPlayers.add(registeredPlayer);
        }

        System.out.println("Players registered successfully!");
    }

    
    
    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner();

    
     public static void main(String[] args) {
        WarCardGame game = new WarCardGame(); // Replace "YourGame" with the specific child class name
        game.registerPlayers();
        game.play();
        game.declareWinner();
    }
}//end class
