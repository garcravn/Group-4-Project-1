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
    public WarPlayer(String name) {
        super(name);
    }

    @Override
    public void play() {
        // Implement the play logic for the War game scenario
        System.out.println(getName() + " is playing War.");
    }
}
