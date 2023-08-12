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
    }
}
