/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author kaurg
 */
public class RegisteredPlayer extends Player {
    
     private User user; 

    public RegisteredPlayer(String name,User user) {
        super(name);
        this.user =user;
    }
   

    @Override
    public void play() {
        // Implement the play logic for the Registered player scenario
        System.out.println(getName() + " is playing as a registered player.");
        
             // Authenticate the user
        if (authenticateUser()) {
            System.out.println("Welcome, " + user.getUsername() + "!");
            // Implement the actual gameplay for registered players
            System.out.println("Starting the game...");
            // Add your gameplay logic here
        } else {
            System.out.println("Authentication failed. Only registered players can play.");
        }
    }

    private boolean authenticateUser() {
        // TODO: Implement user authentication logic
        // Replace this with actual authentication code
        return user.getPassword().equals("correct_password");
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
   
    }

